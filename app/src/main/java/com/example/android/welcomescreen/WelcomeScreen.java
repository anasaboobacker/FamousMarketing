package com.example.android.welcomescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

    }

    public void partnerClick(View v) {

        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), FamousPartner.class));
    }
}

