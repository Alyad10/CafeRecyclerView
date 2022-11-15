package com.example.caferecyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CafeAdapter extends RecyclerView.Adapter<CafeViewHolder> {
    CafeAdapter(ArrayList<String> cafeList){
        this.cafeList = cafeList;
    }
    private ArrayList <String> cafeList;
    @NonNull
    @Override
    public CafeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new CafeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cafe,
                parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CafeViewHolder holder, int position) {
        holder.bind(cafeList.get(position));

    }

    @Override
    public int getItemCount() {
        return cafeList.size();
    }
}
