package com.example.jnumokchun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_create_write.*

class CreateWriteActivity : AppCompatActivity() {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_write)

        WriteOk.setOnClickListener {
            Log.d(TAG,"login - 확인 버튼이 클릭 되었다.")
            val intent = Intent(this, QuertionListActivity::class.java)
            startActivity(intent)


        }
    }
}
