package com.example.kotlindemo.Model

data class Inventory (var item : String, var value1 : Int, var value2 : Int, var total : Int)

object InventoryList {



    val inventory_items = listOf<Inventory>(
        Inventory("A", 0,0,   total = 0),
        Inventory("B",0,0,    total = 0),
        Inventory("C",0,0,    total = 0),
        Inventory("D",0,0,    total = 0),
        Inventory("E",0,0,  total = 0),
        Inventory("F",0,0,  total = 0),
        Inventory("G",0,0,  total = 0),
        Inventory("H",0,0,  total = 0),
        Inventory("I",0,0, total = 0)
    )


}