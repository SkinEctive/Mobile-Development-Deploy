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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.skinective.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnDetect;

  @NonNull
  public final CardView cvItem1;

  @NonNull
  public final CardView cvItem2;

  @NonNull
  public final CardView cvItem3;

  @NonNull
  public final ShapeableImageView idImgScan;

  @NonNull
  public final ShapeableImageView idImgScan2;

  @NonNull
  public final ShapeableImageView idImgScan3;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final RecyclerView rvThreeLastDetect;

  @NonNull
  public final TextView tvArticleDescription;

  @NonNull
  public final TextView tvArticleDescription2;

  @NonNull
  public final TextView tvArticleDescription3;

  @NonNull
  public final TextView tvArticleTitle;

  @NonNull
  public final TextView tvArticleTitle2;

  @NonNull
  public final TextView tvArticleTitle3;

  @NonNull
  public final TextView tvDetectedNumber;

  @NonNull
  public final TextView tvDetectedText;

  @NonNull
  public final TextView tvLastDetected;

  @NonNull
  public final TextView tvLastDetectedDisease;

  @NonNull
  public final TextView tvLearnMoreHistory;

  @NonNull
  public final TextView tvViewMoreNews;

  @NonNull
  public final TextView tvWelcomeName;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnDetect,
      @NonNull CardView cvItem1, @NonNull CardView cvItem2, @NonNull CardView cvItem3,
      @NonNull ShapeableImageView idImgScan, @NonNull ShapeableImageView idImgScan2,
      @NonNull ShapeableImageView idImgScan3, @NonNull ImageView imageView,
      @NonNull RecyclerView rvThreeLastDetect, @NonNull TextView tvArticleDescription,
      @NonNull TextView tvArticleDescription2, @NonNull TextView tvArticleDescription3,
      @NonNull TextView tvArticleTitle, @NonNull TextView tvArticleTitle2,
      @NonNull TextView tvArticleTitle3, @NonNull TextView tvDetectedNumber,
      @NonNull TextView tvDetectedText, @NonNull TextView tvLastDetected,
      @NonNull TextView tvLastDetectedDisease, @NonNull TextView tvLearnMoreHistory,
      @NonNull TextView tvViewMoreNews, @NonNull TextView tvWelcomeName) {
    this.rootView = rootView;
    this.btnDetect = btnDetect;
    this.cvItem1 = cvItem1;
    this.cvItem2 = cvItem2;
    this.cvItem3 = cvItem3;
    this.idImgScan = idImgScan;
    this.idImgScan2 = idImgScan2;
    this.idImgScan3 = idImgScan3;
    this.imageView = imageView;
    this.rvThreeLastDetect = rvThreeLastDetect;
    this.tvArticleDescription = tvArticleDescription;
    this.tvArticleDescription2 = tvArticleDescription2;
    this.tvArticleDescription3 = tvArticleDescription3;
    this.tvArticleTitle = tvArticleTitle;
    this.tvArticleTitle2 = tvArticleTitle2;
    this.tvArticleTitle3 = tvArticleTitle3;
    this.tvDetectedNumber = tvDetectedNumber;
    this.tvDetectedText = tvDetectedText;
    this.tvLastDetected = tvLastDetected;
    this.tvLastDetectedDisease = tvLastDetectedDisease;
    this.tvLearnMoreHistory = tvLearnMoreHistory;
    this.tvViewMoreNews = tvViewMoreNews;
    this.tvWelcomeName = tvWelcomeName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_detect;
      Button btnDetect = ViewBindings.findChildViewById(rootView, id);
      if (btnDetect == null) {
        break missingId;
      }

      id = R.id.cv_item1;
      CardView cvItem1 = ViewBindings.findChildViewById(rootView, id);
      if (cvItem1 == null) {
        break missingId;
      }

      id = R.id.cv_item2;
      CardView cvItem2 = ViewBindings.findChildViewById(rootView, id);
      if (cvItem2 == null) {
        break missingId;
      }

      id = R.id.cv_item3;
      CardView cvItem3 = ViewBindings.findChildViewById(rootView, id);
      if (cvItem3 == null) {
        break missingId;
      }

      id = R.id.id_img_scan;
      ShapeableImageView idImgScan = ViewBindings.findChildViewById(rootView, id);
      if (idImgScan == null) {
        break missingId;
      }

      id = R.id.id_img_scan2;
      ShapeableImageView idImgScan2 = ViewBindings.findChildViewById(rootView, id);
      if (idImgScan2 == null) {
        break missingId;
      }

      id = R.id.id_img_scan3;
      ShapeableImageView idImgScan3 = ViewBindings.findChildViewById(rootView, id);
      if (idImgScan3 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.rv_three_last_detect;
      RecyclerView rvThreeLastDetect = ViewBindings.findChildViewById(rootView, id);
      if (rvThreeLastDetect == null) {
        break missingId;
      }

      id = R.id.tv_article_description;
      TextView tvArticleDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvArticleDescription == null) {
        break missingId;
      }

      id = R.id.tv_article_description2;
      TextView tvArticleDescription2 = ViewBindings.findChildViewById(rootView, id);
      if (tvArticleDescription2 == null) {
        break missingId;
      }

      id = R.id.tv_article_description3;
      TextView tvArticleDescription3 = ViewBindings.findChildViewById(rootView, id);
      if (tvArticleDescription3 == null) {
        break missingId;
      }

      id = R.id.tv_article_title;
      TextView tvArticleTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvArticleTitle == null) {
        break missingId;
      }

      id = R.id.tv_article_title2;
      TextView tvArticleTitle2 = ViewBindings.findChildViewById(rootView, id);
      if (tvArticleTitle2 == null) {
        break missingId;
      }

      id = R.id.tv_article_title3;
      TextView tvArticleTitle3 = ViewBindings.findChildViewById(rootView, id);
      if (tvArticleTitle3 == null) {
        break missingId;
      }

      id = R.id.tv_detected_number;
      TextView tvDetectedNumber = ViewBindings.findChildViewById(rootView, id);
      if (tvDetectedNumber == null) {
        break missingId;
      }

      id = R.id.tv_detected_text;
      TextView tvDetectedText = ViewBindings.findChildViewById(rootView, id);
      if (tvDetectedText == null) {
        break missingId;
      }

      id = R.id.tv_last_detected;
      TextView tvLastDetected = ViewBindings.findChildViewById(rootView, id);
      if (tvLastDetected == null) {
        break missingId;
      }

      id = R.id.tv_last_detected_disease;
      TextView tvLastDetectedDisease = ViewBindings.findChildViewById(rootView, id);
      if (tvLastDetectedDisease == null) {
        break missingId;
      }

      id = R.id.tv_learn_more_history;
      TextView tvLearnMoreHistory = ViewBindings.findChildViewById(rootView, id);
      if (tvLearnMoreHistory == null) {
        break missingId;
      }

      id = R.id.tv_view_more_news;
      TextView tvViewMoreNews = ViewBindings.findChildViewById(rootView, id);
      if (tvViewMoreNews == null) {
        break missingId;
      }

      id = R.id.tv_welcome_name;
      TextView tvWelcomeName = ViewBindings.findChildViewById(rootView, id);
      if (tvWelcomeName == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, btnDetect, cvItem1, cvItem2,
          cvItem3, idImgScan, idImgScan2, idImgScan3, imageView, rvThreeLastDetect,
          tvArticleDescription, tvArticleDescription2, tvArticleDescription3, tvArticleTitle,
          tvArticleTitle2, tvArticleTitle3, tvDetectedNumber, tvDetectedText, tvLastDetected,
          tvLastDetectedDisease, tvLearnMoreHistory, tvViewMoreNews, tvWelcomeName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}