// Generated by view binder compiler. Do not edit!
package com.skinective.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.skinective.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final ImageButton btnEditPhoto;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final CardView cameraBackground;

  @NonNull
  public final TextInputEditText etDob;

  @NonNull
  public final TextInputEditText etEmail;

  @NonNull
  public final TextInputEditText etFirstname;

  @NonNull
  public final TextInputEditText etLastname;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RadioButton rbFemale;

  @NonNull
  public final RadioButton rbMale;

  @NonNull
  public final RadioGroup rgGender;

  @NonNull
  public final TextInputLayout tilDob;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilFirstname;

  @NonNull
  public final TextInputLayout tilLastname;

  @NonNull
  public final TextView tvDobLabel;

  @NonNull
  public final TextView tvEmailLabel;

  @NonNull
  public final TextView tvFirstnameLabel;

  @NonNull
  public final TextView tvGenderLabel;

  @NonNull
  public final TextView tvLastnameLabel;

  @NonNull
  public final TextView tvProfileTitle;

  private ActivityEditProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton backButton, @NonNull ImageButton btnEditPhoto, @NonNull Button btnSave,
      @NonNull CardView cameraBackground, @NonNull TextInputEditText etDob,
      @NonNull TextInputEditText etEmail, @NonNull TextInputEditText etFirstname,
      @NonNull TextInputEditText etLastname, @NonNull ConstraintLayout main,
      @NonNull CircleImageView profileImage, @NonNull ProgressBar progressBar,
      @NonNull RadioButton rbFemale, @NonNull RadioButton rbMale, @NonNull RadioGroup rgGender,
      @NonNull TextInputLayout tilDob, @NonNull TextInputLayout tilEmail,
      @NonNull TextInputLayout tilFirstname, @NonNull TextInputLayout tilLastname,
      @NonNull TextView tvDobLabel, @NonNull TextView tvEmailLabel,
      @NonNull TextView tvFirstnameLabel, @NonNull TextView tvGenderLabel,
      @NonNull TextView tvLastnameLabel, @NonNull TextView tvProfileTitle) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.btnEditPhoto = btnEditPhoto;
    this.btnSave = btnSave;
    this.cameraBackground = cameraBackground;
    this.etDob = etDob;
    this.etEmail = etEmail;
    this.etFirstname = etFirstname;
    this.etLastname = etLastname;
    this.main = main;
    this.profileImage = profileImage;
    this.progressBar = progressBar;
    this.rbFemale = rbFemale;
    this.rbMale = rbMale;
    this.rgGender = rgGender;
    this.tilDob = tilDob;
    this.tilEmail = tilEmail;
    this.tilFirstname = tilFirstname;
    this.tilLastname = tilLastname;
    this.tvDobLabel = tvDobLabel;
    this.tvEmailLabel = tvEmailLabel;
    this.tvFirstnameLabel = tvFirstnameLabel;
    this.tvGenderLabel = tvGenderLabel;
    this.tvLastnameLabel = tvLastnameLabel;
    this.tvProfileTitle = tvProfileTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_edit_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_button;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.btn_edit_photo;
      ImageButton btnEditPhoto = ViewBindings.findChildViewById(rootView, id);
      if (btnEditPhoto == null) {
        break missingId;
      }

      id = R.id.btn_save;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.camera_background;
      CardView cameraBackground = ViewBindings.findChildViewById(rootView, id);
      if (cameraBackground == null) {
        break missingId;
      }

      id = R.id.et_dob;
      TextInputEditText etDob = ViewBindings.findChildViewById(rootView, id);
      if (etDob == null) {
        break missingId;
      }

      id = R.id.et_email;
      TextInputEditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_firstname;
      TextInputEditText etFirstname = ViewBindings.findChildViewById(rootView, id);
      if (etFirstname == null) {
        break missingId;
      }

      id = R.id.et_lastname;
      TextInputEditText etLastname = ViewBindings.findChildViewById(rootView, id);
      if (etLastname == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.profile_image;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rb_female;
      RadioButton rbFemale = ViewBindings.findChildViewById(rootView, id);
      if (rbFemale == null) {
        break missingId;
      }

      id = R.id.rb_male;
      RadioButton rbMale = ViewBindings.findChildViewById(rootView, id);
      if (rbMale == null) {
        break missingId;
      }

      id = R.id.rg_gender;
      RadioGroup rgGender = ViewBindings.findChildViewById(rootView, id);
      if (rgGender == null) {
        break missingId;
      }

      id = R.id.til_dob;
      TextInputLayout tilDob = ViewBindings.findChildViewById(rootView, id);
      if (tilDob == null) {
        break missingId;
      }

      id = R.id.til_email;
      TextInputLayout tilEmail = ViewBindings.findChildViewById(rootView, id);
      if (tilEmail == null) {
        break missingId;
      }

      id = R.id.til_firstname;
      TextInputLayout tilFirstname = ViewBindings.findChildViewById(rootView, id);
      if (tilFirstname == null) {
        break missingId;
      }

      id = R.id.til_lastname;
      TextInputLayout tilLastname = ViewBindings.findChildViewById(rootView, id);
      if (tilLastname == null) {
        break missingId;
      }

      id = R.id.tv_dob_label;
      TextView tvDobLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvDobLabel == null) {
        break missingId;
      }

      id = R.id.tv_email_label;
      TextView tvEmailLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvEmailLabel == null) {
        break missingId;
      }

      id = R.id.tv_firstname_label;
      TextView tvFirstnameLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvFirstnameLabel == null) {
        break missingId;
      }

      id = R.id.tv_gender_label;
      TextView tvGenderLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvGenderLabel == null) {
        break missingId;
      }

      id = R.id.tv_lastname_label;
      TextView tvLastnameLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvLastnameLabel == null) {
        break missingId;
      }

      id = R.id.tv_profile_title;
      TextView tvProfileTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvProfileTitle == null) {
        break missingId;
      }

      return new ActivityEditProfileBinding((ConstraintLayout) rootView, backButton, btnEditPhoto,
          btnSave, cameraBackground, etDob, etEmail, etFirstname, etLastname, main, profileImage,
          progressBar, rbFemale, rbMale, rgGender, tilDob, tilEmail, tilFirstname, tilLastname,
          tvDobLabel, tvEmailLabel, tvFirstnameLabel, tvGenderLabel, tvLastnameLabel,
          tvProfileTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
