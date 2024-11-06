package com.example.example_navbar.ui.pets;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.example_navbar.DatabaseHelper;
import com.example.example_navbar.Hewan;
import com.example.example_navbar.PetsAdapter;
import com.example.example_navbar.R;
import com.example.example_navbar.TambahHewan;
import com.example.example_navbar.databinding.FragmentPetsBinding;

import java.util.List;

public class PetsFragment extends Fragment {

    private FragmentPetsBinding binding;
    private PetsAdapter adapter;
    private List<Hewan> hewanList;
    private DatabaseHelper dbHelper;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPetsBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        dbHelper = new DatabaseHelper(getActivity());
        hewanList = dbHelper.getAllHewan();

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewPets);
        adapter = new PetsAdapter(hewanList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        Button b_add = view.findViewById(R.id.btn_add);
        b_add.setOnClickListener(v -> {
            Intent i = new Intent(getActivity(), TambahHewan.class);
            startActivity(i);
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        // Memuat ulang data saat fragment aktif
        hewanList.clear();
        hewanList.addAll(dbHelper.getAllHewan());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

