package com.reactnativestarter;

import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity{

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

        Radar.initialize(this);
        Radar.setPlacesProvider(RadarPlacesProvider.FACEBOOK);
        Radar.requestPermissions(this);
        Radar.startTracking();

    // ...
    }

    public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

        @Override
        public void onTokenRefresh() {
          String fcmToken = FirebaseInstanceId.getInstance().getToken();
      
          try {
            JSONObject metadata = new JSONObject();
            metadata.put("fcmToken", fcmToken);
            Radar.setMetadata(metadata);
          } catch (JSONException e) {
            // ...
          }
        }
    }

}
