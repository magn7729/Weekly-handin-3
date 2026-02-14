package com.example.lib.opgave01



fun main(){

    // Her opretter jeg en tom array liste som kan indeholde Article Objekter
    val articles = ArrayList<Article>()

    // Her oprettes de 5 Article Objekter og bliver tilføjet til listen
    articles.add(Article("Magnus Nielsen", "Min bog"))
    articles.add(Article("JK Rowling", "Harry Potter"))
    articles.add(Article("Tolkien","Lord of the Rings"))
    articles.add(Article("Astrid Lindgren ","Pippi Langstrømpe"))
    articles.add(Article("Tolkien","Hobitten"))

    // Her laver jeg et for loop
    // Går igennem hvert element i listen
    for (article in articles)
        println(article)
    // Her kalder jeg "article" og printer den samtidig i output

}