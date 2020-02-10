package com.example.kotlindemo.Model

data class Daily (var Ditem: String , var Dvalue1 : Int, var Dvalue2 : Int){

    object DialyList {

        val daily_items = listOf<Daily>(
            Daily("Gasoline & Hybrid",0,0),
            Daily("Diesel  Oil",0,0),
            Daily("Motorbike",0,0),
            Daily("Gear Oil",0,0),
            Daily("Coolant",0,0),
            Daily("Brake Fluid",0,0),
            Daily("Hydraulic",0,0),
            Daily("Industrial Gear Oil",0,0),
            Daily("Greases",0,0))
    }

}