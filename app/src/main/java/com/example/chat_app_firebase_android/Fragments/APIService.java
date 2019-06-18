package com.example.chat_app_firebase_android.Fragments;

import com.example.chat_app_firebase_android.Notification.MyResponse;
import com.example.chat_app_firebase_android.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAuDM7Ymc:APA91bF01R3cSUNs5ve2rzxP4lXaNy6rXEp3QlFG1z5F4i-EVmyizzUS19aqkS-Uu0cF4Eoila1Wu9-HFFJ1UjxYXUuJ6KlKN4EVNdMZR7P_Mil65SADFJGJQPfYxmkI0L1wXBZs5z8_"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
