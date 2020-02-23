package com.example.pahlawan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHereos;
    private ArrayList<HeroesModel> listhero = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHereos = findViewById(R.id.pahlawan_list);
        rvHereos.setHasFixedSize(true);
        listhero.addAll(HeroesData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvHereos.setLayoutManager(new LinearLayoutManager(this));
        HereosAdapter adapter = new HereosAdapter(this);
        adapter.setHeroesModels(listhero);
        rvHereos.setAdapter(adapter);
    }
}
