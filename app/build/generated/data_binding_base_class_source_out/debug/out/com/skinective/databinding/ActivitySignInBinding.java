// Generated by view binder compiler. Do not edit!
package com.skinective.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final CardView cvLogin;

  @NonNull
  public final TextInputEditText edtEmail;

  @NonNull
  public final TextInputEditText edtPassword;

  @NonNull
  public final ImageView ivBackground;

  @NonNull
  public final ImageView ivLogo;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilPassword;

  @NonNull
  public final TextView toRegister;

  @NonNull
  public final TextView tvSignIn;

  @NonNull
  public final View viewOverlay;

  private ActivitySignInBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnLogin,
      @NonNull CardView cvLogin, @NonNull TextInputEditText edtEmail,
      @NonNull TextInputEditText edtPassword, @NonNull ImageView ivBackground,
      @NonNull ImageView ivLogo, @NonNull ConstraintLayout main, @NonNull ProgressBar progressBar,
      @NonNull TextInputLayout tilEmail, @NonNull TextInputLayout tilPassword,
      @NonNull TextView toRegister, @NonNull TextView tvSignIn, @NonNull View viewOverlay) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.cvLogin = cvLogin;
    this.edtEmail = edtEmail;
    this.edtPassword = edtPassword;
    this.ivBackground = ivBackground;
    this.ivLogo = ivLogo;
    this.main = main;
    this.progressBar = progressBar;
    this.tilEmail = tilEmail;
    this.tilPassword = tilPassword;
    this.toRegister = toRegister;
    this.tvSignIn = tvSignIn;
    this.viewOverlay = viewOverlay;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.cv_login;
      CardView cvLogin = ViewBindings.findChildViewById(rootView, id);
      if (cvLogin == null) {
        break missingId;
      }

      id = R.id.edt_email;
      TextInputEditText edtEmail = ViewBindings.findChildViewById(rootView, id);
      if (edtEmail == null) {
        break missingId;
      }

      id = R.id.edt_password;
      TextInputEditText edtPassword = ViewBindings.findChildViewById(rootView, id);
      if (edtPassword == null) {
        break missingId;
      }

      id = R.id.iv_background;
      ImageView ivBackground = ViewBindings.findChildViewById(rootView, id);
      if (ivBackground == null) {
        break missingId;
      }

      id = R.id.iv_logo;
      ImageView ivLogo = ViewBindings.findChildViewById(rootView, id);
      if (ivLogo == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.til_email;
      TextInputLayout tilEmail = ViewBindings.findChildViewById(rootView, id);
      if (tilEmail == null) {
        break missingId;
      }

      id = R.id.til_password;
      TextInputLayout tilPassword = ViewBindings.findChildViewById(rootView, id);
      if (tilPassword == null) {
        break missingId;
      }

      id = R.id.to_register;
      TextView toRegister = ViewBindings.findChildViewById(rootView, id);
      if (toRegister == null) {
        break missingId;
      }

      id = R.id.tv_sign_in;
      TextView tvSignIn = ViewBindings.findChildViewById(rootView, id);
      if (tvSignIn == null) {
        break missingId;
      }

      id = R.id.view_overlay;
      View viewOverlay = ViewBindings.findChildViewById(rootView, id);
      if (viewOverlay == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ConstraintLayout) rootView, btnLogin, cvLogin, edtEmail,
          edtPassword, ivBackground, ivLogo, main, progressBar, tilEmail, tilPassword, toRegister,
          tvSignIn, viewOverlay);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
