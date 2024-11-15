package com.example.signinsignout.firebase;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Objects;

/**
 * Service to handle Firebase Cloud Messaging.
 */
public class MessagingService extends FirebaseMessagingService {

    /**
     * Called when a new token for the default Firebase project is generated.
     * @param token The new token.
     */
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d("FCM", "Token: " + token);
    }

    /**
     * Called when a message is received.
     * @param message The remote message received.
     */
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        Log.d("FCM", "460 Message: " + Objects.requireNonNull(message.getNotification()).getBody());
    }
}
