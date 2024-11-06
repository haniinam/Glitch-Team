package com.example.example_navbar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "hewan.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE hewan_table (id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, jenis TEXT, jenisKelamin TEXT, usia TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS hewan_table");
        onCreate(db);
    }

    public void addHewan(Hewan hewan) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nama", hewan.getNamaHewan());
        values.put("jenis", hewan.getJenisHewan());
        values.put("jenisKelamin", hewan.getJenisKelamin());
        values.put("usia", hewan.getUsia());

        db.insert("hewan_table", null, values);
        db.close();
    }

    public List<Hewan> getAllHewan() {
        List<Hewan> hewanList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM hewan_table", null);

        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(0); // ID hewan
                String nama = cursor.getString(1); // Nama hewan
                String jenis = cursor.getString(2); // Jenis hewan
                String jenisKelamin = cursor.getString(3); // Jenis kelamin
                String usia = cursor.getString(4); // Usia

                Hewan hewan = new Hewan(id, nama, jenis, jenisKelamin, usia);
                hewanList.add(hewan);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return hewanList;
    }

}
