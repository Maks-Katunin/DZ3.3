package com.geektech.dz33;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LanguagesViewHolder extends RecyclerView.ViewHolder {

    private ImageView images, line;
    private TextView name;

    public LanguagesViewHolder(@NonNull View itemView) {
        super(itemView);
        images = itemView.findViewById(R.id.iv_pictures);
        line = itemView.findViewById(R.id.iv_bottom_line);
        name = itemView.findViewById(R.id.tv_languages);
    }

    public void onBind(ModelLanguages modelLanguages){
        images.setImageResource(modelLanguages.getImage());
        line.setImageResource(modelLanguages.getImage());
        name.setText(modelLanguages.getLanguages());

    }
}
