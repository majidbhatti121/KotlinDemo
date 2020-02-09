package com.example.kotlindemo.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindemo.DetailActivity
import com.example.kotlindemo.HomeActivity
import com.example.kotlindemo.Model.Market
import com.example.kotlindemo.R
import kotlinx.android.synthetic.main.list_item.view.*

class MarketAdapter(val context : Context, val market_list: List<Market>) : RecyclerView.Adapter<MarketAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }
    override fun getItemCount(): Int {
        return market_list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val market_item = market_list[position]
        holder.setData(market_item, position)
    }

    inner class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        var CurrentMarket : Market? = null
        var CurrentPosition : Int = 0

        init {
            itemView.setOnClickListener {
              //  Toast.makeText(context, CurrentMarket!!.title  + "Clicked", Toast.LENGTH_SHORT).show()
                val intent = Intent(context , DetailActivity::class.java)
                    intent.putExtra("MarketName",CurrentMarket!!.title)
                    context.startActivity(intent)

            }
        }

        fun setData(market: Market?, pos : Int){

            itemView.txvTitle.text = market!!.title
            this.CurrentMarket = market
            this.CurrentPosition = pos


        }
    }
}