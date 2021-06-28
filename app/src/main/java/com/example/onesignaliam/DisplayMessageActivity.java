package com.example.onesignaliam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.onesignal.OneSignal;


public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //change key to display message
        OneSignal.removeTriggerForKey("activityNum");
        OneSignal.addTrigger("activityNum", 2);
        //print key for debugging
        Log.d(null, "PRINTING2");
        Log.d(null, OneSignal.getTriggerValueForKey("activityNum").toString());
    }

    public void returnActivity (View view) {
        finish();

    }
}