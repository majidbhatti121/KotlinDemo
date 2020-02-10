package com.example.kotlindemo

import android.content.DialogInterface
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.method.TextKeyListener.clear
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.size
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.example.kotlindemo.Adapter.InventoryAdapter
import com.example.kotlindemo.Model.Inventory
import com.example.kotlindemo.Model.InventoryList
import com.example.kotlindemo.R
import com.example.kotlindemo.ui.main.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.fragment_detail.*
import java.lang.reflect.Type


class DetailActivity : AppCompatActivity() {

    var PRIVATE_MODE = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        LoadData()

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)



        var cancel= findViewById<Button>(R.id.cancel_btn)
        var okay  = findViewById<Button>(R.id.okay_btn)
       tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{

            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }

            override fun onTabSelected(p0: TabLayout.Tab?) {
                cancel.setOnClickListener {
                    if (p0!!.position.equals(0)) {

                        val dialogBuilder = AlertDialog.Builder(this@DetailActivity)

                        // set message of alert dialog
                        dialogBuilder.setMessage("Do you want to close this page ?")
                            // if the dialog is cancelable
                            .setCancelable(false)
                            // positive button text and action
                            .setPositiveButton("Proceed", DialogInterface.OnClickListener {
                                    dialog, id -> finish()
                            })
                            // negative button text and action
                            .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                                    dialog, id -> dialog.cancel()
                            })

                        // create dialog box
                        val alert = dialogBuilder.create()
                        // set title for alert dialog box
                        alert.setTitle("AlertDialogExample")
                        // show alert dialog
                        alert.show()

                        Toast.makeText(applicationContext, "inventory", Toast.LENGTH_SHORT).show()
                    } else if (p0!!.position.equals(1)) {
                        Toast.makeText(applicationContext, "promotional", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext, "daily", Toast.LENGTH_SHORT).show()

                    }
                }

                okay.setOnClickListener {

                    if (p0!!.position.equals(0)) {

                        val dialogBuilder = AlertDialog.Builder(this@DetailActivity)

                        // set message of alert dialog
                        dialogBuilder.setMessage("Do you want to save?")
                            // if the dialog is cancelable
                            .setCancelable(false)
                            // positive button text and action
                            .setPositiveButton("Proceed", DialogInterface.OnClickListener {
                                    dialog, id ->




                                Toast.makeText(applicationContext,"Okay clicked",Toast.LENGTH_SHORT).show()
                            })
                            // negative button text and action
                            .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                                    dialog, id -> dialog.cancel()
                            })

                        // create dialog box
                        val alert = dialogBuilder.create()
                        // set title for alert dialog box
                        alert.setTitle("AlertDialogExample")
                        // show alert dialog
                        alert.show()

                        Toast.makeText(applicationContext, "inventory", Toast.LENGTH_SHORT).show()
                    } else if (p0!!.position.equals(1)) {
                        Toast.makeText(applicationContext, "promotional", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext, "daily", Toast.LENGTH_SHORT).show()

                    }

                }
            }

        })



       /* viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }
            override fun onPageSelected(position: Int) {

               cancel.setOnClickListener {
                   if (position.equals(0))
                   {
                       Toast.makeText(applicationContext,"inventory",Toast.LENGTH_SHORT).show()
                   }
                   else if (position.equals(1)){
                       Toast.makeText(applicationContext,"promotion",Toast.LENGTH_SHORT).show()
                   }
                   else if(position.equals(2)){
                       Toast.makeText(applicationContext,"daily",Toast.LENGTH_SHORT).show()
                   }
               }


            }

        })*/


        }

    fun LoadData(){

        val sharedPref: SharedPreferences = getSharedPreferences("PREF", PRIVATE_MODE)
        //var gson = Gson()
        var jsonString = sharedPref.getString("total value", null)

      // val turns = Gson().fromJson(jsonString, Array<InventoryList>::class.java).toMutableList()

       // val turnsType = object : TypeToken<List<InventoryList>>() {}.type
        //val type = Gson().fromJson<Inventory>(jsonString,Inventory::class.java)

              //  Log.d("Check",turns.toString())


       // val mPosts: List<Post> = Serializer.fromJson(postsStr)



    }

    }



