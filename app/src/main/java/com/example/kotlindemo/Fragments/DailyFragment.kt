package com.example.kotlindemo.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindemo.Adapter.DailyAdapter
import com.example.kotlindemo.DetailActivity
import com.example.kotlindemo.Model.Daily
import com.example.kotlindemo.R
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.fragment_daily.*

/**
 * A simple [Fragment] subclass.
 */
class DailyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daily, container, false)




    }





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        daily_RecyclerView.layoutManager = layoutManager

        val adapter = context?.let { DailyAdapter(it, Daily.DialyList.daily_items) }
       daily_RecyclerView.adapter = adapter
    }


}
