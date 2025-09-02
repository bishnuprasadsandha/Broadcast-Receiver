package com.example.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class AirplaneModeChangedReceiver: BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        if (p1?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED){
            Log.d("checkResult","Airplane Mode Changed event received")
        }
        if (p1?.action == "com.example.broadcastreceviersenderapp.TEST_ACTION"){
            Log.d("checkResult","Test Action Received!!")
        }
    }
}