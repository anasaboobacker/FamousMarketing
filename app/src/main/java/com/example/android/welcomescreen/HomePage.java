package com.example.android.welcomescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class HomePage extends AppCompatActivity {
        RecyclerView recyclerView ;
        RecyclerView.LayoutManager layoutManager ;
        RecyclerView.Adapter adapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview) ;
        layoutManager = new LinearLayoutManager(this) ;
        recyclerView.setLayoutManager(layoutManager) ;
        adapter = new RecyclerAdapter() ;
        recyclerView.setAdapter(adapter);

    }
}
