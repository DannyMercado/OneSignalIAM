package com.example.onesignaliam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.content.Intent;
import android.util.Log;

import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Tester for email and externalID
        OneSignal.setExternalUserId("testID0");
        OneSignal.setEmail("myTest@gmail.com");
        OneSignal.setExternalUserId("testID1");
         */
    }
    @Override
    protected void onResume() {
        super.onResume();
        //change trigger to 1
        OneSignal.removeTriggerForKey("activityNum");
        OneSignal.addTrigger("activityNum", 1);
        //print trigger value for debug
        Log.d(null, "PRINTING");
        Log.d(null, OneSignal.getTriggerValueForKey("activityNum").toString());
    }

    //Button press call changes activity
    public void newActivity (View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);

    }

}