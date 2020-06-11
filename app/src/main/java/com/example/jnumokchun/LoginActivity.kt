package com.example.jnumokchun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    companion object{
        const val TAG: String = "로그"
    }

    //화면이 메모리에 올라간다.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Log.d(TAG,"login - onCreate() called")

        loginok.setOnClickListener {
            Log.d(TAG, "login - 확인 버튼이 클릭 되었다.")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        create_id.setOnClickListener {
            Log.d(TAG, "login - 회원가입 버튼이 클릭 되었다.")
            val intent = Intent(this, CreateIdActivity::class.java)
            startActivity(intent)
        }

    }
}

//            //부메랑 같이 던진다.
//            startActivityForResult(intent, 100)
// 부베랑 받는곧
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//    }