package com.example.kotlindemo.Model

data class Market (var title : String)

object MarketList {

    val market_items = listOf<Market>(
        Market("Market A"),
        Market("Market B"),
        Market("Market C"),
        Market("Market D"),
        Market("Market E"),
        Market("Market F"),
        Market("Market G"),
        Market("Market H"),
        Market("Market I")
    )


}
