package com.example.kotlindemo.Adapter

import android.content.Context
import android.content.Intent
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindemo.DetailActivity
import com.example.kotlindemo.Model.Inventory
import com.example.kotlindemo.Model.Market
import com.example.kotlindemo.R
import kotlinx.android.synthetic.main.detail_list_item.view.*
import java.util.zip.Inflater

class InventoryAdapter(val context: Context, val inventory_list: List<Inventory>) :
    RecyclerView.Adapter<InventoryAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.detail_list_item, parent, false)
        return MyViewHolder(view)


    }

    override fun getItemCount(): Int {
        return inventory_list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val inventory_items = inventory_list[position]
        holder.setInventoryData(inventory_items, position)

    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var etVal1: EditText
        var etVal2: EditText
        var value1: Int = 0
        var value2: Int = 0

        init {

            etVal1 = itemView.findViewById(R.id.txVal1)
            etVal2 = itemView.findViewById(R.id.txVal2)


            etVal1.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence,
                    i: Int,
                    i1: Int,
                    i2: Int
                ) {

                }

                override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

                    inventory_list[adapterPosition].value1
                    Toast.makeText(context,etVal1.text,Toast.LENGTH_SHORT).show()
                    val temp : String = etVal1.text.toString()

                    if (!"".equals(temp)){
                        value1 = temp.toInt()
                    }



                }

                override fun afterTextChanged(editable: Editable) {
                   itemView.txvTotal.text = (value1.plus(value2).toString())


                }
            })

            etVal2.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence,
                    i: Int,
                    i1: Int,
                    i2: Int
                ) {

                }

                override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

                    inventory_list[adapterPosition].value2
                    Toast.makeText(context,etVal2.text,Toast.LENGTH_SHORT).show()
                    val temp : String = etVal2.text.toString()
                    if (!"".equals(temp)){
                        value2 = temp.toInt()
                    }



                }

                override fun afterTextChanged(editable: Editable) {

                    if("".equals(editable)){
                        itemView.txvTotal.text = value1.toString()
                    }
                        itemView.txvTotal.text = (value1.plus(value2).toString())


                }
            })
        }



        fun setInventoryData(inventory: Inventory?, pos: Int) {

            itemView.txvItem.text = inventory!!.item
         //   itemView.txVal1.text = value1
           // itemView.txVal2.text = etVal2.text
           // itemView.txvTotal.text = (value1.plus(value2).toString())


        }



    }


}