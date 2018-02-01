package com.example.android.welcomescreen;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

/**
 * Created by Anas on 30-01-2018.
 */

public class App extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleManager.setLocale(base));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LocaleManager.setLocale(this);
    }

}
