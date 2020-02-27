package com.example.loginactivity;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Set applicationId, and server based on the value in the Heroku settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("abchilders-finstagram") // should correspond to APP_ID env variable
            .clientKey("OurFinstagramIsAShadyAsHellApp") // set explicitly unless clientKey is explicitly configured on Parse server
            .server("http://abchilders-finstagram.herokuapp.com/parse").build());
    }
}
