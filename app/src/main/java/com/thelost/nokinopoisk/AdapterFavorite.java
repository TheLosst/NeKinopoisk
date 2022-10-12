package com.thelost.nokinopoisk;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thelost.nokinopoisk.databinding.ItemListFavoriteBinding;

public class AdapterFavorite extends RecyclerView.Adapter<AdapterFavorite.ViewHolder> {
    @NonNull
    @Override
    public AdapterFavorite.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterFavorite.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ItemListFavoriteBinding binding;

        public ViewHolder(@NonNull ItemListFavoriteBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bindView(/*Сюда передаешь класс модели*/){
            binding.nameTxt.setText("Модель");
            binding.descriptionTxt.setText("Модель");
        }
    }
}
