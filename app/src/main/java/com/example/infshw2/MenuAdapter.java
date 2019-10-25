package com.example.infshw2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> {
    private ArrayList<Menu> menusToAdapt;

    public void setData(ArrayList<Menu> menusToAdapt) {
        this.menusToAdapt = menusToAdapt;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.menu, parent, false);

        MyViewHolder menuViewHolder = new MyViewHolder(view);
        return menuViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Menu menuAtPosition = menusToAdapt.get(position);

        holder.nameTextView.setText(menuAtPosition.getName());
        holder.foodImageView.setImageResource(menuAtPosition.getImageDrawableId());


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, MenuDetailActivity.class);
                intent.putExtra("ItemId", menuAtPosition.getItemId());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return menusToAdapt.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView nameTextView;
        public ImageView foodImageView;

        public MyViewHolder(View v) {
            super(v);
            view = v;
            nameTextView = v.findViewById(R.id.name);
            foodImageView = v.findViewById(R.id.food);
        }
    }
}
