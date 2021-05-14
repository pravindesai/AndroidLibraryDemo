package com.example.loglibrary

import android.view.View
import com.google.android.material.snackbar.Snackbar

object Snack {
    fun SimpleShort(view:View, message:String){
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
    }

    fun SimpleLong(view:View, message:String){
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
    }



}