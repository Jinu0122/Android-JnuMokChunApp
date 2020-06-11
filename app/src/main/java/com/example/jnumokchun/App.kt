package com.example.jnumokchun

import android.app.Application

class App: Application() {
    //안드로이드에선 Context 가 항상 필요한데 Context 를 상속받지 않는 애들을 위해 만들어줌

    companion object{
        lateinit var instance: App
          private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}