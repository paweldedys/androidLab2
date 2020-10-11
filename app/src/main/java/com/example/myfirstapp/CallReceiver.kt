package com.example.myfirstapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager


class CallReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.getStringExtra(TelephonyManager.EXTRA_STATE) == TelephonyManager.EXTRA_STATE_RINGING) {
            telephonyListener?.onCallReceived()
        }
    }

    companion object {

        private var telephonyListener: TelephonyListener? = null

        fun bindListener(telephonyListener: TelephonyListener) {
            CallReceiver.telephonyListener = telephonyListener
        }

    }

}