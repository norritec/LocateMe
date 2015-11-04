package app.norritec.com.locateme;

import android.content.Intent;
import android.graphics.Typeface;
import android.location.Location;
import android.os.Bundle;
import android.app.Activity;
import android.os.StrictMode;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main extends Activity implements View.OnClickListener
{
    TextView resultView;


    Button button2;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();

        if (id== R.id.action_menu){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void msg(View v)
    {
        SmsManager sms=SmsManager.getDefault();
        sms.sendTextMessage("ENTER EMERGENCY NUMBER", null, "hello this is a test from my app", null, null);
    }


    private void buttonClick()
    {
        startActivity(new Intent("android.intent.action.MapsAvtivity"));

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                buttonClick();
                break;

        }
    }



    }

