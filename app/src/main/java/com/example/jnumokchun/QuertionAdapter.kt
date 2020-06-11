package com.example.jnumokchun

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class QuertionAdapter:RecyclerView.Adapter<QertionViewHolder>(){
    //외부에서 데이터를 받아옴
    private var quertionlistmodel = ArrayList<Quertionlistmodel>()

    val TAG: String = "로그"
    //뷰홀더가 생성 될때
    //뷰를 연결하는쪽에서는 레이아웃인플래터라는애가 들어간다,생성하는 컨택스트를 가져오게된다
    //인플레이드하면서 리소스랑 XML 이랑 서로 연결한다.
    //return 은 뷰홀더가 생성할떄 어떤 녀석을 연결할꺼냐!! 우리는 QertionVH를 연결할꺼다
    // (각모양에따라 리턴을 다르게해 처리 할 수 있다)
    //xml 이랑 연결하는 부분이다 /어떤 녀석을띄울꺼냐? (따른거뛰울수도있음)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QertionViewHolder {
        Log.d(TAG,"QuertionAdapter - xml 이랑 연결하는부분")
        return QertionViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.quertionlistrecyclerview, parent, false))
    }
    //보여줄 목록 갯수
    override fun getItemCount(): Int {
//        Log.d(TAG,"QuertionAdapter - getItemCount() called")
        return quertionlistmodel.size
    }
    //데이터가 묶일때
    override fun onBindViewHolder(holder: QertionViewHolder, position: Int) {
        Log.d(TAG,"QuertionAdapter - 데이터가 묶일때")

        //데이터와 뷰 묶음
        holder.bindView(this.quertionlistmodel[position])
    }

    //어답터에 데이터 심어주는 메소드(quertionlistmodel)매게변수로 받음
    //외부에서 데이터 넘기기
    //여기로 데이터들어온다.
   fun submitList(quertionlistmodelfromactivity: ArrayList<Quertionlistmodel>){
        this.quertionlistmodel = quertionlistmodelfromactivity
    }

}