package com.example.kotlindemo.Fragments


import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindemo.Adapter.InventoryAdapter
import com.example.kotlindemo.Model.InventoryList

import com.example.kotlindemo.R
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_detail.*

/**
 * A simple [Fragment] subclass.
 */
class InventoryFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var PRIVATE_MODE = 0
        val PREF_NAME = "PREF"
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inventory, container, false)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


      val arrPackage : Array<InventoryList> = arrayOf(InventoryList)


        // Populating data in Recyclervie


        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        inventory_RecyclerView.layoutManager = layoutManager

        val adapter = context?.let { InventoryAdapter(it, InventoryList.inventory_items) }
        inventory_RecyclerView.adapter = adapter



    }



}
