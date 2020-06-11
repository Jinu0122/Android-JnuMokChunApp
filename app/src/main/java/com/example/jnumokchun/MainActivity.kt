package com.example.jnumokchun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
       const val TAG: String = "로그"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"MainActivity - onCreate() called")

        bsbutton.setOnClickListener {
            Log.d(TAG,"login - 궁금해요 버튼이 클릭 되었다.")
            val intent = Intent(this, QuertionListActivity::class.java)
            startActivity(intent)
        }

        //유저 저장
//        SharedManger.storeUserInfo("asd123","홍길동",20201020)

        save_user.setOnClickListener {
            //저장된 데이터를 가져온다.
//            val storedUserName = SharedManger.getUserName()
//            Log.d(TAG, "login - 저장된 유저이름: $storedUserName")

            val storedUser = SharedManger.getUser()
            Log.d(TAG,"CreateID - 저장된 유저 - 이름 : ${storedUser.name}  / 아이디 : ${storedUser.id} / 비밀번호 : ${storedUser.password} / 생년월일 : ${storedUser.age} / 폰넘버 : ${storedUser.phone} " )
            //입력부분에 보여주기

            //이거는 해당 에딧테스크에서 나타나게된다.
//            User_NAME.setText(storedUser.name)
//            User_ID.setText(storedUser.id)
//            User_PASSWORD.setText(storedUser.password)
//            //에러가뛰는 이유는 숫자형이기때문에 스트링으로 바꿔줘야한다.
//            //에딧테스트는 스트링이기때문에 인트형 못받음
//            User_AGE.setText(storedUser.age.toString())
//            User_Phone.setText(storedUser.phone.toString())


        }
    }

}
