package com.example.jnumokchun

import android.util.Log

data class QuertionListContent (var title: String?=null , var content: String?=null){

    val TAG: String = "로그"

    init {
        Log.d(TAG,"quertionlistmodel - ?????????????")
    }
}
