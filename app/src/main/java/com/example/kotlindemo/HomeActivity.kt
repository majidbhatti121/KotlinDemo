package com.example.kotlindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindemo.Adapter.MarketAdapter
import com.example.kotlindemo.Model.MarketList
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        actionBar?.setTitle("Home")


       val intent = intent.extras ?: return
        val  user = intent.get("Username")
        tv_user.text = "Welcome , " + user.toString()

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter  = MarketAdapter(this, MarketList.market_items)
        recyclerView.adapter = adapter

    }
}
