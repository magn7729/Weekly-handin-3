package com.example.lib.opgave01

class Article (
    val author: String,
    val title: String
){
    override fun toString(): String{
        return "Title: $title, Author: $author"
    }
}