package com.thelost.nokinopoisk;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thelost.nokinopoisk.databinding.FragmentFavoriteBinding;
import com.thelost.nokinopoisk.databinding.FragmentSearchBinding;

public class FavoriteFragment extends Fragment {

    FragmentFavoriteBinding binding;
    AdapterMoves adapterMoves;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentFavoriteBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        adapterMoves = new AdapterMoves();
        binding.recyclerViewFavorite.setAdapter(adapterMoves);
        binding.recyclerViewFavorite.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}