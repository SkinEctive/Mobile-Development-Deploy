// Generated by view binder compiler. Do not edit!
package com.skinective.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.skinective.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWelcomescreen3Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button createAccountButton;

  @NonNull
  public final ImageView ivsplashScreen;

  @NonNull
  public final ImageView ivvectorScr3;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final TextView tvHeadlinescreen3;

  @NonNull
  public final TextView tvTitlescreen3;

  private ActivityWelcomescreen3Binding(@NonNull ConstraintLayout rootView,
      @NonNull Button createAccountButton, @NonNull ImageView ivsplashScreen,
      @NonNull ImageView ivvectorScr3, @NonNull Button loginButton,
      @NonNull TextView tvHeadlinescreen3, @NonNull TextView tvTitlescreen3) {
    this.rootView = rootView;
    this.createAccountButton = createAccountButton;
    this.ivsplashScreen = ivsplashScreen;
    this.ivvectorScr3 = ivvectorScr3;
    this.loginButton = loginButton;
    this.tvHeadlinescreen3 = tvHeadlinescreen3;
    this.tvTitlescreen3 = tvTitlescreen3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWelcomescreen3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWelcomescreen3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_welcomescreen3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWelcomescreen3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.create_account_button;
      Button createAccountButton = ViewBindings.findChildViewById(rootView, id);
      if (createAccountButton == null) {
        break missingId;
      }

      id = R.id.ivsplashScreen;
      ImageView ivsplashScreen = ViewBindings.findChildViewById(rootView, id);
      if (ivsplashScreen == null) {
        break missingId;
      }

      id = R.id.ivvector_scr3;
      ImageView ivvectorScr3 = ViewBindings.findChildViewById(rootView, id);
      if (ivvectorScr3 == null) {
        break missingId;
      }

      id = R.id.login_button;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.tv_headlinescreen3;
      TextView tvHeadlinescreen3 = ViewBindings.findChildViewById(rootView, id);
      if (tvHeadlinescreen3 == null) {
        break missingId;
      }

      id = R.id.tv_titlescreen3;
      TextView tvTitlescreen3 = ViewBindings.findChildViewById(rootView, id);
      if (tvTitlescreen3 == null) {
        break missingId;
      }

      return new ActivityWelcomescreen3Binding((ConstraintLayout) rootView, createAccountButton,
          ivsplashScreen, ivvectorScr3, loginButton, tvHeadlinescreen3, tvTitlescreen3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
