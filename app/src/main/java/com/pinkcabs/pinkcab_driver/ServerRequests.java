package com.pinkcabs.pinkcab_driver;

import android.content.Context;

/**
 * Created by Lenovo on 15-Oct-16.
 */

public class ServerRequests {
    private ResponseCallback callback;

    private String NEW_DRIVER="http://198.199.120.41/pinkcabs/v1/register/driver";
    private String UPDATE_LOCATION="http://198.199.120.41/pinkcabs/v1/driver/location/_user_fireb_id";
    private String UPDATE_FCM_TOKEN="http://198.199.120.41/pinkcabs/v1/driver/_drv_fireb_id_/update-token";
    public void setCallback(ResponseCallback callback) {
        this.callback = callback;
    }

    void newDriver(Context ctx, String driverFirebaseId, String driverFcmId, double latitude, double longitude) {

    }

    interface ResponseCallback {
        void response(Object data);
    }
}
