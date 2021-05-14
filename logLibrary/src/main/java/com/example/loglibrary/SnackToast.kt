package com.example.loglibrary

import android.content.Context
import android.widget.Toast

object SnackToast {
    fun Short(context:Context, message:String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    fun Long(context:Context, message:String){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}