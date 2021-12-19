package com.geektech.dz33;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelLanguages> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        inirRecycler();
        loadData();
    }

    private void inirRecycler() {
        LanguagesAdapter adapter = new LanguagesAdapter(data);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
        data.add(new ModelLanguages(R.drawable.ic_anguage, R.drawable.ic_line, "kotlin"));
    }


}