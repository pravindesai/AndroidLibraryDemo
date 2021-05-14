package com.example.androidlibrarydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)


        button.setOnClickListener {

        }

    }

//    fun snack(view:View):Boolean{
//        var clicked = false
//
//            Snackbar.make(view,
//                "Confirm", Snackbar.LENGTH_LONG)
//                .setAction("YES",{
//                    clicked = true
//                }).show()
//
//        return clicked
//    }
}