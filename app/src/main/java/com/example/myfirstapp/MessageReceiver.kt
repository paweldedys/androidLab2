package com.example.myfirstapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent


class MessageReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        telephonyListener?.onTextMessageReceived()
    }

    companion object {

        private var telephonyListener: TelephonyListener? = null

        fun bindListener(telephonyListener: TelephonyListener) {
            MessageReceiver.telephonyListener = telephonyListener
        }

    }

}