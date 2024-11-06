package com.example.example_navbar.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.example_navbar.DogProductActivity;
import com.example.example_navbar.R;
import com.example.example_navbar.databinding.FragmentHomeBinding;
import com.example.example_navbar.KeranjangActivity;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    private ImageButton imageButtonDog;
    private ImageButton imageButtonCat;
    private ImageButton imageButtonBird;
    private ImageButton imageButtonHamster;

    private AutoCompleteTextView autoCompleteSearch;

    private ImageButton imageButtonBasicGrooming;
    private ImageButton imageButtonFullGrooming;
    private ImageButton imageButtonSpaRelaksasi;
    private ImageButton imageButtonPetHotelDay;
    private ImageButton imageButtonPetHotelNight;
    private ImageButton imageButtonPetHotelFull;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Inisialisasi ImageButton
        ImageButton chart = root.findViewById(R.id.ivCart);

        // Set OnClickListener untuk chart
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Berpindah ke KeranjangActivity
                Intent i = new Intent(getActivity(), KeranjangActivity.class);
                startActivity(i);
            }
        });


        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
