package com.example.jnumokchun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_quertion_list.*


class QuertionListActivity : AppCompatActivity() {

    val TAG: String = "로그"


    // 데이터를 담을 그릇 즛 배열
    var modelList = ArrayList<Quertionlistmodel>()
    //lateinit나중에 값을 넣겠다는 의미
    private lateinit var  QuertionAdapter:QuertionAdapter

    //뷰가 화면에 그려질때때
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quertion_list)

        questionwrite.setOnClickListener {
            Log.d(TAG,"login - 확인 버튼이 클릭 되었다.")
            val intent = Intent(this, CreateWriteActivity::class.java)
            startActivity(intent)
        }

//데이터준비하기
        for (i in 1..10){
            var Quertionlistmodel =Quertionlistmodel("제목","홍길동","2019.05.05")
            modelList.add(Quertionlistmodel)
        }
        //어답터만들기(어답터를 준비한다) / 여기서 어답터를 호출해 어답터 명령어 실행후 밑에 명령어로 전달한다
        QuertionAdapter = QuertionAdapter()
        //저장된데이터를 어답터에 전달하기(장착)
        QuertionAdapter.submitList(modelList)
        //적용시키기 어떤식으로 할지 (세로가로 등등)
        list_view.apply {
//            방향향
            //위에 설정해놓은 어답터를 어답터에 집어넣기
            layoutManager = LinearLayoutManager(this@QuertionListActivity, LinearLayoutManager.VERTICAL, false)
            adapter= QuertionAdapter
        }


        Log.d(TAG,"QuertionList - this.modelList.size : ${this.modelList}")

    }
}
