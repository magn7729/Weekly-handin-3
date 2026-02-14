package com.example.lib.opgave02


fun main() {

    // Opret posts
    val post1 = RedditPost("Magnus Nielsen", "Hvordan man bliver god til Kotlin")
    val post2 = RedditPost("Adam Rasmussen", "Min vej til det ensomme bjerg")
    val post3 = RedditPost("Tobias Hansen", "Min rejse gennem USA")

    // Simuler at nogle oplysninger bliver opdateret
    // Brug setters
    /* // Tjek om dette overhovedet skal bruges.
    post1.setTitle("Advanced Kotlin - En komplet guide")
    post2.setAuthor("Adam R.")

     */

    // Brug vote-funktioner
    post1.upvote()
    post1.upvote()

    post2.downvote()

    post3.upvote()
    post3.upvote()
    post3.upvote()

    // Brug setBalance (for at vise den virker)
    post2.setBalance(5)

    // Brug getters
    println("Post1 Author: ${post1.getAuthor()}")
    println("Post1 Title: ${post1.getTitle()}")
    println("Post1 Balance: ${post1.getBalance()}")
    println("Post1 Date: ${post1.getDate()}")
    println()

    // Læg i liste
    val posts = listOf(post1, post2, post3)

    // Sortér
    val sortedPosts = posts.sorted()

    // Print alle (kalder toString)
    println("Sorted posts:")
    for (post in sortedPosts) {
        println(post)
    }
}
