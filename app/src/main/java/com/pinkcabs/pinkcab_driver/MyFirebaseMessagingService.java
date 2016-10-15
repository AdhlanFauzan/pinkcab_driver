package com.pinkcabs.pinkcab_driver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        if (remoteMessage.getData().size()>0) {
            Map<String,String> map=remoteMessage.getData();

            try {
                JSONObject jsonObject = new JSONObject(map.get("data"));
                JSONObject jObj=jsonObject.getJSONObject("user_data");
                //this jsonObject contains
                //auto increment id: u_id == integer
                //firebase id: user_fireb_id -- string
                //user latutude: latitude -- double
                //user longitude: longitude -- double
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
