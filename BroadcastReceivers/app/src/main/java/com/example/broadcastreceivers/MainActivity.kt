package com.example.broadcastreceivers

import android.annotation.SuppressLint
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val airplaneModeChangedReceiver = AirplaneModeChangedReceiver()

    @SuppressLint("UnspecifiedRegisterReceiverFlag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        registerReceiver(airplaneModeChangedReceiver, IntentFilter("com.example.broadcastreceviersenderapp.TEST_ACTION"))
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(airplaneModeChangedReceiver)
    }
}