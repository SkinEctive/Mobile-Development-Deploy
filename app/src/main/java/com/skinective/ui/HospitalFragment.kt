package com.skinective.ui

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.skinective.R
import com.skinective.databinding.FragmentHospitalBinding
import com.skinective.network.api.APIService
import com.skinective.network.api.LocationRequest
import com.skinective.network.responses.Hospital
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HospitalFragment : Fragment() {

    private var _binding: FragmentHospitalBinding? = null
    private val binding get() = _binding!!
    private lateinit var hospitalAdapter: HospitalAdapter
    private val hospitals: MutableList<Hospital> = mutableListOf()

    private lateinit var googleMap: GoogleMap
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    private val REQUEST_LOCATION_PERMISSION = 1
    private val DEFAULT_LATITUDE = -6.200000
    private val DEFAULT_LONGITUDE = 106.816666

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHospitalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize RecyclerView
        hospitalAdapter = HospitalAdapter(hospitals)
        binding.rvHospitals.layoutManager = LinearLayoutManager(requireContext())
        binding.rvHospitals.adapter = hospitalAdapter

        // Initialize map and location client
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync { map ->
            googleMap = map
            setupMap()
        }

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())

        // Request location permission
        if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            getCurrentLocation()
        } else {
            ActivityCompat.requestPermissions(requireActivity(), arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), REQUEST_LOCATION_PERMISSION)
        }
    }

    private fun setupMap() {
        // Customize map settings
        googleMap.uiSettings.isZoomControlsEnabled = true

        // Load current location (if permission granted)
        getCurrentLocation()
    }

    private fun getCurrentLocation() {
        if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
            ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            fusedLocationClient.lastLocation
                .addOnSuccessListener { location ->
                    if (location != null) {
                        val userLatLng = LatLng(location.latitude, location.longitude)
                        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(userLatLng, 12f))
                        googleMap.addMarker(MarkerOptions().position(userLatLng).title("You are here"))
                        loadNearbyHospitals(LocationRequest(location.latitude, location.longitude))
                    } else {
                        handleLocationUnavailable()
                    }
                }
                .addOnFailureListener { e ->
                    Toast.makeText(requireContext(), "Error getting location: ${e.message}", Toast.LENGTH_SHORT).show()
                    handleLocationUnavailable()
                }
        } else {
            ActivityCompat.requestPermissions(requireActivity(), arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), REQUEST_LOCATION_PERMISSION)
        }
    }

    private fun handleLocationUnavailable() {
        val defaultLatLng = LatLng(DEFAULT_LATITUDE, DEFAULT_LONGITUDE)
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(defaultLatLng, 12f))
        googleMap.addMarker(MarkerOptions().position(defaultLatLng).title("Default Location"))
        Toast.makeText(requireContext(), "Last known location is not available", Toast.LENGTH_SHORT).show()
        loadNearbyHospitals(LocationRequest(DEFAULT_LATITUDE, DEFAULT_LONGITUDE))
    }

    private fun loadNearbyHospitals(locationRequest: LocationRequest) {
        // Clear previous data
        hospitals.clear()

        // Call API to get nearby hospitals
        val apiService = APIService.getHospitals()
        val call = apiService.getHospitals(locationRequest)

        call.enqueue(object: Callback<List<Hospital>> {
            override fun onResponse(call: Call<List<Hospital>>, response: Response<List<Hospital>>) {
                if (response.isSuccessful) {
                    val nearbyHospitals = response.body()
                    if (nearbyHospitals != null) {
                        hospitals.addAll(nearbyHospitals)
                        hospitalAdapter.notifyDataSetChanged()
                    }
                } else {
                    Toast.makeText(requireContext(), "Failed to load hospitals", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<List<Hospital>>, t: Throwable) {
                Toast.makeText(requireContext(), "Error loading hospitals: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode == REQUEST_LOCATION_PERMISSION) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getCurrentLocation()
            } else {
                Toast.makeText(requireContext(), "Location permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
