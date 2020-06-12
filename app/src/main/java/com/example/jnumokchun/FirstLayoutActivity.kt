package com.example.jnumokchun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class FirstLayoutActivity : AppCompatActivity() {

    companion object{
        const val TAG: String = "로그"
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_layout)
        Log.d(TAG,"FirstLayoutActivity - onCreate() called")


    }
}
