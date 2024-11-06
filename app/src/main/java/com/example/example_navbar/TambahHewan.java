package com.example.example_navbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.example_navbar.ui.pets.PetsFragment;

public class TambahHewan extends AppCompatActivity {
    ImageButton back;
    Spinner jns_hewan;

    private EditText etNamaHewan, etUsia;
    private Spinner spinnerJenis;
    private RadioGroup radioGroupJK;
    private ImageView fotoHewan;
    private Button btnAddHewan, btnAddFoto;
    private DatabaseHelper dbHelper; // Pastikan ada referensi untuk database helper

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_hewan);

        etNamaHewan = findViewById(R.id.et_nama_hewan);
        etUsia = findViewById(R.id.et_usia);
        radioGroupJK = findViewById(R.id.jk);
        fotoHewan = findViewById(R.id.foto_hewan);
        btnAddHewan = findViewById(R.id.btn_add_hewan);
        btnAddFoto = findViewById(R.id.add_foto);
        dbHelper = new DatabaseHelper(this); // Inisialisasi database helper

        back = findViewById(R.id.btn_back);
        back.setOnClickListener(view -> {
            Intent i = new Intent(TambahHewan.this, PetsFragment.class);
            startActivity(i);
        });

        jns_hewan = findViewById(R.id.jenis);
        String[] jenisHewan = {"Anjing", "Kucing", "Burung", "Hamster"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, jenisHewan);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        jns_hewan.setAdapter(adapter);

        btnAddHewan.setOnClickListener(v -> saveHewan()); // Panggil metode saveHewan di sini
    }

    private void saveHewan() {
        String namaHewan = etNamaHewan.getText().toString().trim();
        String usia = etUsia.getText().toString().trim();
        String jenis = jns_hewan.getSelectedItem().toString(); // Perbaiki referensi
        String jenisKelamin = ((RadioButton) findViewById(radioGroupJK.getCheckedRadioButtonId())).getText().toString();

        if (namaHewan.isEmpty() || usia.isEmpty()) {
            Toast.makeText(this, "Nama dan usia harus diisi", Toast.LENGTH_SHORT).show(); // Tampilkan pesan kesalahan
            return;
        }

        Hewan hewan = new Hewan(0, namaHewan, jenis, jenisKelamin, usia);
        dbHelper.addHewan(hewan); // Menyimpan hewan ke database
        Toast.makeText(this, "Hewan berhasil ditambahkan", Toast.LENGTH_SHORT).show(); // Tampilkan pesan sukses
        finish(); // Menutup activity setelah menambah data
    }
}
