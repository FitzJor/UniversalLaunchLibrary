package com.example.launchlibrary.core


import android.content.Context
import android.content.Intent
import android.net.Uri
import com.google.gson.Gson
import android.provider.Settings
import android.util.Log
import com.example.launchlibrary.model.DefaultRequest

class Pasarela {

    fun showLog() {
        Log.d("Pasarela", "showLog")
    }

    fun sendDefaultRequest(context: Context) {
        val defaultRequest = DefaultRequest(1, 1, 1, 1, 1, 252.0, 3.15, getAndroidDeviceId(context), false, 1, "2021-10-10")
        val jsonDefaultRequest = Gson().toJson(defaultRequest)

        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("respuestapedidos://result")
            putExtra("jsonDefaultRequest", jsonDefaultRequest)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
    }

    private fun getAndroidDeviceId(context: Context): String {
        return Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
    }
}