package com.example.example_navbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class DogProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_product);

//        Button buttonCatWetFood = findViewById(R.id.buttonCatWetFood);
//        buttonCatWetFood.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(CatProductActivity.this, CatWetFoodActivity.class);
//                startActivity(intent);
//            }
//        });

        ImageButton backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Kembali ke halaman sebelumnya
            }
        });


        // Implementasi yang sama untuk kategori produk lainnya


//        // CardView untuk produk 1
//        CardView cardViewProduct1 = findViewById(R.id.CWFProduk1);
//        cardViewProduct1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(DogProductActivity.this, "Detail Produk", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(DogProductActivity.this, CWFProduk1.class);
//                startActivity(intent);
//            }
//        });
//
//        // CardView untuk produk 2
//        CardView cardViewProduct2 = findViewById(R.id.CWFProduk2);
//        cardViewProduct2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(DogProductActivity.this, "Detail Produk", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(DogProductActivity.this, CWFProduk2.class);
//                startActivity(intent);
//            }
//        });
//
//        // CardView untuk produk 3
//        CardView cardViewProduct3 = findViewById(R.id.CWFProduk3);
//        cardViewProduct3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(DogProductActivity.this, "Detail Produk", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(DogProductActivity.this, CWFProduk3.class);
//                startActivity(intent);
//            }
//        });
//
//        // CardView untuk produk 4
//        CardView cardViewProduct4 = findViewById(R.id.CWFProduk4);
//        cardViewProduct4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(DogProductActivity.this, "Detail Produk", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(DogProductActivity.this, CWFProduk4.class);
//                startActivity(intent);
//            }
//        });
//
//        // CardView untuk produk 5
//        CardView cardViewProduct5 = findViewById(R.id.CWFProduk5);
//        cardViewProduct5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(DogProductActivity.this, "Detail Produk", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(DogProductActivity.this, CWFProduk5.class);
//                startActivity(intent);
//            }
//        });
//
//        // CardView untuk produk 6
//        CardView cardViewProduct6 = findViewById(R.id.CWFProduk6);
//        cardViewProduct6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(DogProductActivity.this, "Detail Produk", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(DogProductActivity.this, CWFProduk6.class);
//                startActivity(intent);
//            }
//        });
//
//        // CardView untuk produk 7
//        CardView cardViewProduct7 = findViewById(R.id.CWFProduk7);
//        cardViewProduct7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(DogProductActivity.this, "DetailProduk", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(DogProductActivity.this, CWFProduk7.class);
//                startActivity(intent);
//            }
//        });
//
//        // CardView untuk produk 8
//        CardView cardViewProduct8 = findViewById(R.id.CWFProduk8);
//        cardViewProduct8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(DogProductActivity.this, "Detail Produk", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(DogProductActivity.this, CWFProduk8.class);
//                startActivity(intent);
//            }
//        });
    }
}



