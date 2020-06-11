package com.example.jnumokchun

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.quertionlistrecyclerview.view.*

class QertionViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    val TAG: String = "로그"
    //뷰를 가져온다.
    private val quertiontitleview = itemView.titleview
    private val qertionnameview = itemView.nameview
    private val qertiontimeview = itemView.timeview


    //데이터와 뷰를 묶는다.
    fun bindView(Quertionlistmodel: Quertionlistmodel){
        Log.d(TAG,"QertionVH - bind() called")
        quertiontitleview.text = Quertionlistmodel.title
        qertionnameview.text = Quertionlistmodel.name
        qertiontimeview.text = Quertionlistmodel.time
    }
    //기본생성자
    init{
        Log.d(TAG,"QertionVH - 뷰끼와 데이터가 연결되었습니다")
    }
}