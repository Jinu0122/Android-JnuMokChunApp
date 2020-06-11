package com.example.jnumokchun

import android.util.Log

class Quertionlistmodel(var title: String?= null, var name : String?= null, var time : String?= null ) {
    val TAG: String = "로그"

init {
    Log.d(TAG,"quertionlistmodel - 모델정하기")
}
}