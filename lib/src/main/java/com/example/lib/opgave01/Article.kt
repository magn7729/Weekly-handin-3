package com.example.lib.opgave01

// Jeg opretter klassen Article
// Den har to properties -> author & title
class Article (
    val author: String,
    val title: String
){
    override fun toString(): String{
        return "Title: $title, Author: $author"
    }
}

// toString bestemmer hvordan objektet skal vises som tekst
// Metoden bliver automatisk kaldt når jeg bruger println(article)