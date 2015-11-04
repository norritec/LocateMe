package app.norritec.com.locateme;

import android.location.Location;
import android.os.Bundle;
import android.telephony.SmsManager;

public class LocationActivity extends MapsActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
