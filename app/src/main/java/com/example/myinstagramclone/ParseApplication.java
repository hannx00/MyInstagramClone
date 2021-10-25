package com.example.myinstagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created.
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("XZ2Y4op8GVSRyGJWE1FnPBCHBn4YYm2tnT1zIeDK")
                .clientKey("yKrpUj093jBdiuqmDFgPavSAxHA0Dia4kDniHMO8")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }


}
