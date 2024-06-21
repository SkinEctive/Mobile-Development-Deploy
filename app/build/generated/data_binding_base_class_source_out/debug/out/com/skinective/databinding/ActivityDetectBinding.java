// Generated by view binder compiler. Do not edit!
package com.skinective.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.camera.view.PreviewView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.skinective.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetectBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnCapture;

  @NonNull
  public final ImageButton btnClose;

  @NonNull
  public final CardView cvBack;

  @NonNull
  public final CardView cvCapture;

  @NonNull
  public final ImageView ivUpload;

  @NonNull
  public final LinearLayout llUpload;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final View overlay;

  @NonNull
  public final TextView tvUpload;

  @NonNull
  public final PreviewView viewFinder;

  private ActivityDetectBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnCapture, @NonNull ImageButton btnClose, @NonNull CardView cvBack,
      @NonNull CardView cvCapture, @NonNull ImageView ivUpload, @NonNull LinearLayout llUpload,
      @NonNull ConstraintLayout main, @NonNull View overlay, @NonNull TextView tvUpload,
      @NonNull PreviewView viewFinder) {
    this.rootView = rootView;
    this.btnCapture = btnCapture;
    this.btnClose = btnClose;
    this.cvBack = cvBack;
    this.cvCapture = cvCapture;
    this.ivUpload = ivUpload;
    this.llUpload = llUpload;
    this.main = main;
    this.overlay = overlay;
    this.tvUpload = tvUpload;
    this.viewFinder = viewFinder;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detect, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetectBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_capture;
      AppCompatButton btnCapture = ViewBindings.findChildViewById(rootView, id);
      if (btnCapture == null) {
        break missingId;
      }

      id = R.id.btn_close;
      ImageButton btnClose = ViewBindings.findChildViewById(rootView, id);
      if (btnClose == null) {
        break missingId;
      }

      id = R.id.cv_back;
      CardView cvBack = ViewBindings.findChildViewById(rootView, id);
      if (cvBack == null) {
        break missingId;
      }

      id = R.id.cv_capture;
      CardView cvCapture = ViewBindings.findChildViewById(rootView, id);
      if (cvCapture == null) {
        break missingId;
      }

      id = R.id.iv_upload;
      ImageView ivUpload = ViewBindings.findChildViewById(rootView, id);
      if (ivUpload == null) {
        break missingId;
      }

      id = R.id.ll_upload;
      LinearLayout llUpload = ViewBindings.findChildViewById(rootView, id);
      if (llUpload == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.overlay;
      View overlay = ViewBindings.findChildViewById(rootView, id);
      if (overlay == null) {
        break missingId;
      }

      id = R.id.tv_upload;
      TextView tvUpload = ViewBindings.findChildViewById(rootView, id);
      if (tvUpload == null) {
        break missingId;
      }

      id = R.id.viewFinder;
      PreviewView viewFinder = ViewBindings.findChildViewById(rootView, id);
      if (viewFinder == null) {
        break missingId;
      }

      return new ActivityDetectBinding((ConstraintLayout) rootView, btnCapture, btnClose, cvBack,
          cvCapture, ivUpload, llUpload, main, overlay, tvUpload, viewFinder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}