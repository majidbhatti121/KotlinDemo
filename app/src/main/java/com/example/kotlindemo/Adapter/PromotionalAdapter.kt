package com.example.kotlindemo.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindemo.Model.Promotional
import com.example.kotlindemo.R
import kotlinx.android.synthetic.main.fragment_promotional_list_item.view.*

class PromotionalAdapter(val context : Context, val promotion_list: List<Promotional>) : RecyclerView.Adapter<PromotionalAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PromotionalAdapter.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_promotional_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
      return  promotion_list.size
    }

    override fun onBindViewHolder(holder: PromotionalAdapter.MyViewHolder, position: Int) {
        val promotional_item = promotion_list[position]
        holder.setPromotionalData(promotional_item, position)
    }



    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setPromotionalData(promotional: Promotional, pos:Int){

            itemView.PItem.text = promotional.Pitem

        }

    }

}