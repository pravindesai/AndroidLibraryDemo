package com.example.loglibrary

import android.util.Log

object SnackLog {
        var count:Int = 1

        fun print(pattern:String, data:String){
            println("$pattern --> $data")
        }

        fun printCount(pattern:String, data:String){
            print("$pattern  -$count-> $data")
            count++
        }

        fun printError(tag:String, data:String){
            Log.e("$tag", "--> $data" )
        }

        fun printCountError(tag:String, data:String){
            Log.e("$tag", "-$count-> $data" )
            count++
        }

}