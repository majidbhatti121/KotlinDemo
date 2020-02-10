package com.example.kotlindemo.Model

data class Promotional(var Pitem: String , var Pvalue : Int){

    object PromotionalList {

        val promotional_items = listOf<Promotional>(
            Promotional("Watches",0),
            Promotional("Clock",0),
            Promotional("Usb",0),
            Promotional("Hats",0),
            Promotional("Pen",0),
            Promotional("Water Bottle",0),
            Promotional("key Chains",0),
            Promotional("Rings",0))
    }

}