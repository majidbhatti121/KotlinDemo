package com.example.kotlindemo.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindemo.Model.Daily
import com.example.kotlindemo.R
import kotlinx.android.synthetic.main.fragment_daily_list_item.view.*

class DailyAdapter(val context: Context, val daily_list: List<Daily>) :
    RecyclerView.Adapter<DailyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.fragment_daily_list_item, parent, false)
        return MyViewHolder(view)
    }


    override fun getItemCount(): Int {
        return daily_list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val daily_item = daily_list[position]
        holder.setDailyData(daily_item, position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setDailyData(daily: Daily,position: Int) {

            itemView.DItem.text = daily.Ditem


        }
    }
}