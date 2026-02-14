package com.example.lib.opgave03

import com.example.lib.opgave02.RedditPost

// Laver en liste over alle Reddit posts
class RedditFrontPage {
    private val posts = mutableListOf<RedditPost>() // Mutablelist så vi kan tilføje og fjerne elementer

    // Laver en metode som sletter post ved index
    fun deleteRedditPost(index: Int) { // Fjerner et RedditPost baseret på index
        if(index in posts.indices) { // // Tjekker om index findes i listen
            posts.removeAt(index) // // Fjerner posten på det valgte index
        } else {
            println("Invalid index: $index")
        }
        }

    fun addPost(post: RedditPost){ // Laver en metode til at tilføje et RedditPost objekter til listen
        posts.add(post)
    }

    fun getPosts(): List<RedditPost>{
        return posts
    }

    }