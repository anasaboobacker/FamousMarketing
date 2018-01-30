package com.example.android.welcomescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FamousPartner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_partner);
    }

    public void loginClick(View v) {

        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), LoginPage.class));
    }

    public void signUpClick(View v) {

        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), SignUp.class));
    }

    public void homeClick(View v) {

        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), HomePage.class));
    }
}
