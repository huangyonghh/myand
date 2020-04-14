package com.example.myapplication15;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class WoDeGuangBo extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(
                context,
                "我接收到了广播！",
                Toast.LENGTH_LONG
        ).show();
    }
}
