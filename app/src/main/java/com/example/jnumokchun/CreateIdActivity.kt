package com.example.jnumokchun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_create_i_d.*

class CreateIdActivity : AppCompatActivity() {

    val TAG: String = "로그"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_i_d)

        Log.d(TAG,"CreateID - onCreate() called")

        //회원가입 버튼이 클릭
        create_ok.setOnClickListener {
            // 신규 사용자
         Log.d(TAG,"CreateID - 회원가입의 확인버튼이 눌렸습니다.")

            val userId = User_ID.text.toString()
            val userName = User_NAME.text.toString()
            var userAge = 0
            if (User_AGE.text.toString().length>1){
                userAge = User_AGE.text.toString().toInt()
            }
            val userPassword = User_PASSWORD.text.toString()
            val userPhone = User_Phone.text.toString()

            val newUser = IDInfo(userId, userName, userAge, userPassword, userPhone)

//            if(User_ID||User_NAME||userPassword){
//
//            }

            //신규 사용자 데이터 저장
            SharedManger.storeUser(newUser)

            User_ID.setText("")
            User_NAME.setText("")
            User_AGE.setText("")
            User_PASSWORD.setText("")
            User_Phone.setText("")

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
    }
}
