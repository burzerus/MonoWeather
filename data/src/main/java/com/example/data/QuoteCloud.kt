package com.example.data

import com.google.gson.annotations.SerializedName

data class QuoteCloud (

    @SerializedName("quote")    val quote: String,
    @SerializedName("author")    val author: String


    )


