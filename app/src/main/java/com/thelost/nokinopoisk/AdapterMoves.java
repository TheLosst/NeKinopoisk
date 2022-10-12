package com.thelost.nokinopoisk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thelost.nokinopoisk.databinding.ItemListBinding;

public class AdapterMoves extends RecyclerView.Adapter<AdapterMoves.ViewHolder> {
    @NonNull
    @Override
    public AdapterMoves.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListBinding binding = ItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMoves.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ItemListBinding binding;

        public ViewHolder(@NonNull ItemListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bindView(/*Сюда передаешь класс модели*/){
            binding.nameTxt.setText("Модель");
            binding.descriptionTxt.setText("Модель");
        }
    }
}
