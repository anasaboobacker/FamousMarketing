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


        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }


////    public void partnerClick(View v) {
////        Button partnerButton = new Button(this) ;
////        partnerButton.setId(R.id.individuals_button);
////        partnerButton = (Button) findViewById(R.id.individuals_button) ;
////        partnerButton.setClickable(true);
////        partnerButton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////
////                startActivity(new Intent(getApplicationContext(), FamousPartner.class));
////
////            }
////        });
//
//
//
//
//    }
}

