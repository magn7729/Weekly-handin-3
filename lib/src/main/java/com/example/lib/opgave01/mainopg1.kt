package com.example.lib.opgave01



fun main(){

    val articles = ArrayList<Article>()

    articles.add(Article("Magnus Nielsen", "Min bog"))
    articles.add(Article("JK Rowling", "Harry Potter"))
    articles.add(Article("Tolkien","Lord of the Rings"))
    articles.add(Article("Astrid Lindgren ","Pippi Langstrømpe"))
    articles.add(Article("Tolkien","Hobitten"))

    for (article in articles)
        println(article)

}