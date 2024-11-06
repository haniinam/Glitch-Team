package com.example.example_navbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PetsAdapter extends RecyclerView.Adapter<PetsAdapter.PetViewHolder> {

    private List<Hewan> hewanList;

    public PetsAdapter(List<Hewan> hewanList) {
        this.hewanList = hewanList;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate layout untuk item hewan
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_hewan, parent, false);
        return new PetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        // Mengambil hewan untuk posisi saat ini
        Hewan hewan = hewanList.get(position);
        holder.tvNamaHewan.setText(hewan.getNamaHewan());
        holder.tvDetail.setText(hewan.getJenisHewan()); // Contoh menggunakan jenis hewan
        // TODO: Atur gambar hewan jika ada
    }

    @Override
    public int getItemCount() {
        return hewanList.size();
    }

    // ViewHolder untuk menyimpan referensi tampilan item
    public static class PetViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaHewan, tvDetail;
        ImageView ivHewan, ivDelete; // Gambar hewan dan tombol hapus jika diperlukan

        public PetViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaHewan = itemView.findViewById(R.id.beo); // Ganti dengan ID yang sesuai
            tvDetail = itemView.findViewById(R.id.detail); // Ganti dengan ID yang sesuai
            ivHewan = itemView.findViewById(R.id.burung); // Ganti dengan ID yang sesuai
            ivDelete = itemView.findViewById(R.id.delete); // Ganti dengan ID yang sesuai

            // Set onClickListener jika diperlukan untuk menghapus atau melihat detail
            ivDelete.setOnClickListener(v -> {
                // Hapus hewan dari daftar dan panggil notifyDataSetChanged
            });
        }
    }
}
