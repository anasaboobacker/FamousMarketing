package com.example.android.welcomescreen;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;

import java.util.Locale;

/**
 * Created by Anas on 31-01-2018.
 */

public class LocaleManager {
    public static final String LANGUAGE_PREF = "languange-pref";

    public static Context setLocale(Context c) {
        return setNewLocale(c, getLanguage(c));
    }

    public static Context setNewLocale(Context c, String language) {
        persistLanguage(c, language);
        return updateResources(c, language);
    }

    public static String getLanguage(Context c) {
        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(c);
        return preference.getString(LANGUAGE_PREF, "en");
    }

    private static void persistLanguage(Context c, String language) {
        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(c);
        preference.edit().putString(LANGUAGE_PREF, language).commit();
    }

    private static Context updateResources(Context context, String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);

        Resources res = context.getResources();
        Configuration config = new Configuration(res.getConfiguration());
        if (Build.VERSION.SDK_INT >= 17) {
            config.setLocale(locale);
            context = context.createConfigurationContext(config);
        } else {
            config.locale = locale;
            res.updateConfiguration(config, res.getDisplayMetrics());
        }
        return context;
    }

}
