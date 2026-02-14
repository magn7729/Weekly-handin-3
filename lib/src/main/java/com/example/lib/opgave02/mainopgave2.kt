package com.example.lib.opgave02


fun main() {

    // Opret posts
    val post1 = RedditPost("Magnus Nielsen", "Hvordan man bliver god til Kotlin")
    val post2 = RedditPost("Adam Rasmussen", "Min vej til det ensomme bjerg")
    val post3 = RedditPost("Tobias Hansen", "Min rejse gennem USA")


    // Her ændrer vi balancen via metoder
    // Dette gør vi da balance er private
    // Derfor bruger vi metoder (encapsulation)
    post1.upvote()
    post1.upvote()

    post2.downvote()

    post3.upvote()
    post3.upvote()
    post3.upvote()

    // Bruger en setter da det giver adgang til at ændre balance
    post2.setBalance(5)

    // Brug getters fordi author er private
    // Derfor bruger vi "getters"
    println("Post1 Author: ${post1.getAuthor()}")
    println("Post1 Title: ${post1.getTitle()}")
    println("Post1 Balance: ${post1.getBalance()}")
    println("Post1 Date: ${post1.getDate()}")
    println()

    // Lægger posts i liste
    val posts = listOf(post1, post2, post3)

    // Sortering
    val sortedPosts = posts.sorted()

    // Printer alle posts
    println("Sorted posts:")
    for (post in sortedPosts) {
        println(post)
    }
}
