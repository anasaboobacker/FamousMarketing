package com.example.android.welcomescreen;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Anas on 31-01-2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleManager.setLocale(base));
    }
}
