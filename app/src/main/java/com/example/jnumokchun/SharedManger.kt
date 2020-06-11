package com.example.jnumokchun

import android.content.Context
import android.util.Log

// 싱글턴 적용
object SharedManger {


    //CONT 확정주는애
    const val USER_PASSWORD="user_password"

    const val TAG: String = "로그"
    // 데이터 저장
    fun storeUserInfo(id: String, userName: String, userAge: Int){

        //쉐어드 가져오기 App.instance까지가 context  (거희다 Context.MODE_PRIVATE로 사용함)
        val shared = App.instance.getSharedPreferences("user_info", Context.MODE_PRIVATE)

        //쉐어드에 에디터 가져오기
        val editor = shared.edit()

        // 에디터에 데이터를 넣고
        //키, 값
        editor.putString("user_id", id)
        editor.putString("user_name", userName)
        editor.putInt("user_age", userAge)

        // 에디터 변경사항을 적용
        editor.apply()
    }

    fun storeUser(idInfo:IDInfo){
        //쉐어드 가져오기 App.instance까지가 context  (거희다 Context.MODE_PRIVATE로 사용함)
        val shared = App.instance.getSharedPreferences("user_info", Context.MODE_PRIVATE)

        //쉐어드에 에디터 가져오기
        val editor = shared.edit()


        // 에디터에 데이터를 넣고
        //키, 값
        editor.putString("user_id", idInfo.id)
        editor.putString("user_name", idInfo.name)
        editor.putInt("user_age", idInfo.age!!)
        editor.putString(USER_PASSWORD, idInfo.password)
        editor.putString("user_phone", idInfo.phone!!)

        // 에디터 변경사항을 적용
        editor.apply()
    }

    // 사용자 모델 가져오기
    fun getUser(): IDInfo{
        //쉐어드 가져오기
        val shared = App.instance.getSharedPreferences("user_info", Context.MODE_PRIVATE)

        val storedUsername =shared.getString("user_name","")!!

        val storedUserId = shared.getString("user_id","")

        val storedUserAge = shared.getInt("user_age",0)

        val storedUserPassword = shared.getString(USER_PASSWORD,"")

        val storedUserPhone = shared.getString("user_phone","")

        val storedUser = IDInfo(storedUserId, storedUsername, storedUserAge, storedUserPassword, storedUserPhone)

        return storedUser

    }

    //데이터 하나 가져오기(데이터 전부 가져오기위해선 모델이라고 필요함 (IDInfo가모델임) )
    fun getUserName() : String{
        //쉐어드 가져오기 App.instance까지가 context  (거희다 Context.MODE_PRIVATE로 사용함)
        val shared = App.instance.getSharedPreferences("user_info", Context.MODE_PRIVATE)

        val storeUsername = shared.getString("user_name","")!!

        return storeUsername
    }

}