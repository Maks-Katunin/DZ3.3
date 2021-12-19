package com.geektech.dz33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LanguagesAdapter extends RecyclerView.Adapter<LanguagesViewHolder> {

    ArrayList<ModelLanguages> list;

    public LanguagesAdapter(ArrayList<ModelLanguages> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public LanguagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LanguagesViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_languages, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LanguagesViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
