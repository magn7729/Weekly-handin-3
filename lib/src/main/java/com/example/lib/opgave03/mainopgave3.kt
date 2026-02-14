package com.example.lib.opgave03

import com.example.lib.opgave02.RedditPost


fun main() {

    val frontPage = RedditFrontPage()

    // Oprette Reddit posts
    val post1 = RedditPost("Magnus", "Post 1")
    val post2 = RedditPost("Adam", "Post 2")
    val post3 = RedditPost("Tobias", "Post 3")

    // Tilføjer posts til forsiden
    frontPage.addPost(post1)
    frontPage.addPost(post2)
    frontPage.addPost(post3)

    println("Before deletion:")
    for (post in frontPage.getPosts()) {
        println(post)
    }

    frontPage.deleteRedditPost(1) // Sletter post med index 1

    println()

    println("After deletion:")
    for (post in frontPage.getPosts()) {
        println(post)
    }
}
