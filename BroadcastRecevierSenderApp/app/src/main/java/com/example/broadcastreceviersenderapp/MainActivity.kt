package com.example.broadcastreceviersenderapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.sendBroadcast).setOnClickListener {
            var intent = Intent("com.example.broadcastreceviersenderapp.TEST_ACTION")
            intent.setPackage("com.example.broadcastreceivers")
            sendBroadcast(intent)
        } 
    }
}