package com.example.lib.opgave03

import com.example.lib.opgave02.RedditPost

class RedditFrontPage {
    // Laver en liste over alle Reddit posts
    private val posts = mutableListOf<RedditPost>()

    // Laver en metode som sletter post ved index
    fun deleteRedditPost(index: Int) {
        if(index in posts.indices) {
            posts.removeAt(index)
        } else {
            println("Invalid index: $index")
        }
        }

    fun addPost(post: RedditPost){
        posts.add(post)
    }

    fun getPosts(): List<RedditPost>{
        return posts
    }

    }