package com.example.signinsignout.utilities;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Class to manage preferences.
 */
public class PreferenceManager {

    private final SharedPreferences sharedPreferences;

    /**
     * Constructor to initialize the SharedPreferences.
     * @param context The context of the application.
     */
    public PreferenceManager(Context context) {
        sharedPreferences = context.getSharedPreferences(Constants.KEY_PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    /**
     * Saves a boolean value in the preferences.
     * @param key The key for the value.
     * @param value The boolean value to be saved.
     */
    public void putBoolean(String key, Boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    /**
     * Retrieves a boolean value from the preferences.
     * @param key The key for the value.
     * @return The boolean value.
     */
    public Boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    /**
     * Saves a string value in the preferences.
     * @param key The key for the value.
     * @param value The string value to be saved.
     */
    public void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    /**
     * Retrieves a string value from the preferences.
     * @param key The key for the value.
     * @return The string value.
     */
    public String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    /**
     * Clears all values in the preferences.
     */
    public void clear() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
