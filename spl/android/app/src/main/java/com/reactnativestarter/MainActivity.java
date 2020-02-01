package com.reactnativestarter;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.facebook.react.ReactActivity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import io.radar.sdk.Radar;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;

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
//        String publishableKey = "prj_test_pk_cbe58927022937762247a6a4eedf1633f442bf65"; // Test Key
//        // foreground only or targeting API level 28 and lower
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
//                != PackageManager.PERMISSION_GRANTED) {
//            // Permission is not granted
//            // Should we show an explanation?
//            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
//                    Manifest.permission.ACCESS_FINE_LOCATION)) {
//                // Show an explanation to the user *asynchronously* -- don't block
//                // this thread waiting for the user's response! After the user
//                // sees the explanation, try again to request the permission.
//            } else {
//                // No explanation needed; request the permission
//                ActivityCompat.requestPermissions(this,
//                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
//                        444);
//
//                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
//                // app-defined int constant. The callback method gets the
//                // result of the request.
//            }
//        } else {
//        }
//        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
//            //code
//            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_BACKGROUND_LOCATION)
//                    != PackageManager.PERMISSION_GRANTED) {
//                // Permission is not granted
//                // Should we show an explanation?
//                if (ActivityCompat.shouldShowRequestPermissionRationale(this,
//                        Manifest.permission.ACCESS_BACKGROUND_LOCATION)) {
//                    // Show an explanation to the user *asynchronously* -- don't block
//                    // this thread waiting for the user's response! After the user
//                    // sees the explanation, try again to request the permission.
//                } else {
//                    // No explanation needed; request the permission
//                    ActivityCompat.requestPermissions(this,
//                            new String[]{Manifest.permission.ACCESS_BACKGROUND_LOCATION},
//                            4494);
//
//                    // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
//                    // app-defined int constant. The callback method gets the
//                    // result of the request.
//                }
//            } else {
//            }
//        }
//
//        Radar.initialize(publishableKey);
////        Radar.setPlacesProvider(Radar.RadarPlacesProvider.FACEBOOK);
////        Radar.requestPermissions(this);
//        Radar.startTracking();
//        Radar.trackOnce((status, location, events, user) -> {
//            // do something with status, location, events, user
//        });
//        // ...
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
