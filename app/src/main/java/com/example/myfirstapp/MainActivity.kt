package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), TelephonyListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MessageReceiver.bindListener(this)
        CallReceiver.bindListener(this)
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
        println("onCreate")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        println("onStart")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
        println("onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
        println("onPause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
        println("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        println("onDestroy")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this, "onBackPressed", Toast.LENGTH_SHORT).show()
        println("onBackPressed")
    }

    override fun onTextMessageReceived() {
        Toast.makeText(this, "onTextMessageReceived", Toast.LENGTH_SHORT).show()
        println("onTextMessageReceived")
    }

    override fun onCallReceived() {
        Toast.makeText(this, "onCallReceived", Toast.LENGTH_SHORT).show()
        println("onCallReceived")
    }
}