package com.example.android.welcomescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class WelcomeScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        Button english = findViewById(R.id.language_english);
        Button arabic = findViewById(R.id.language_arabic);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNewLocale("en",true);
            }
        });

        arabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNewLocale("ar",true);
            }
        });



    }

    public void partnerClick(View v) {


        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }


    private boolean setNewLocale(String language, boolean restartProcess) {
        LocaleManager.setNewLocale(this, language);

        Intent i = new Intent(this, WelcomeScreen.class);
        startActivity(i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));

        if (restartProcess) {
            System.exit(0);
        } else {
            Toast.makeText(this, "Activity restarted", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}

