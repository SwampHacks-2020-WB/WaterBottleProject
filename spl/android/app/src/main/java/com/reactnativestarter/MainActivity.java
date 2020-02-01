package com.reactnativestarter;

import android.os.Bundle;

import com.facebook.react.ReactActivity;

import io.radar.sdk.Radar;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "ReactNativeStarter";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String publishableKey = "prj_test_pk_cbe58927022937762247a6a4eedf1633f442bf65"; // Test Key
        Radar.initialize(publishableKey);
//        Radar.setPlacesProvider(Radar.RadarPlacesProvider.FACEBOOK);
//        Radar.requestPermissions(this);
        Radar.startTracking();

    // ...
    }
//
//    public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
//
//        @Override
//        public void onTokenRefresh() {
//          String fcmToken = FirebaseInstanceId.getInstance().getToken();
//
//          try {
//            JSONObject metadata = new JSONObject();
//            metadata.put("fcmToken", fcmToken);
//            Radar.setMetadata(metadata);
//          } catch (JSONException e) {
//            // ...
//          }
//        }
//    }

}
