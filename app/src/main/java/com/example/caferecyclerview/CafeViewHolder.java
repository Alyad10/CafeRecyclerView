package com.example.caferecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CafeViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCafe;
    public CafeViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCafe = itemView.findViewById(R.id.tv_cafe);



        }
    void bind (String cafe){
        tvCafe.setText(cafe);
    }
}
