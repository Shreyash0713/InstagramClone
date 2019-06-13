package com.shreyash.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("QKjQ99xWZEnt5DKanEY8JeV1WWT49gZQwcnxZUgl")
                // if defined
                .clientKey("BH6qlDAhzhTT7GmrWNWrLdHZmVdQTDeannSVTd0N")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
