package com.example.chat_app_firebase_android;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class Chat_App_Firebase_Android extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
