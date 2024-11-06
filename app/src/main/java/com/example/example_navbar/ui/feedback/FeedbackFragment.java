package com.example.example_navbar.ui.feedback;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.example_navbar.R;
import com.example.example_navbar.databinding.FragmentFeedbackBinding;
import com.example.example_navbar.ui.feedback.FeedbackViewModel;

public class FeedbackFragment extends Fragment {

    private FragmentFeedbackBinding binding;
//    private TextView tvPetify, tvHiThere, tvSubtitle, tvComment, tvContact, tvNomor;
//    private EditText etEnterComment;
//    private RatingBar ratingBar;
//    private Button btnSubmit, btnWhatsApp;
//    private ImageView waImage;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       FeedbackViewModel feedbackViewModel =
                new ViewModelProvider(this).get(FeedbackViewModel.class);

        binding = FragmentFeedbackBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFeedback;
        feedbackViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}