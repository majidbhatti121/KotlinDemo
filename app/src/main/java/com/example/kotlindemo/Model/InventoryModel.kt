package com.example.kotlindemo.Model

data class Inventory (var item : String, var value1 : Int, var value2 : Int, var total : Int)

object InventoryList {



    val inventory_items = listOf<Inventory>(
        Inventory("Gasoline & Hybrid", 0,0,   total = 0),
        Inventory("Diesel  Oil",0,0,    total = 0),
        Inventory("Motorbike",0,0,    total = 0),
        Inventory("Gear Oil",0,0,    total = 0),
        Inventory("Coolant",0,0,  total = 0),
        Inventory("Brake Fluid",0,0,  total = 0),
        Inventory("Hydraulic",0,0,  total = 0),
        Inventory("Industrial Gear Oil",0,0,  total = 0),
        Inventory("Greases",0,0, total = 0)
    )


}