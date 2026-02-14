package com.example.lib.opgave02

import java.time.LocalDate

// RedditPost bruger Comparable
// Dette gør at objekter kan sammelignes og sorteres
class RedditPost(
    author: String, // Bliver modtaget fra constructor
    title: String // Bliver modtaget fra constructor
) : Comparable<RedditPost> {

    // Private attributes
    // Dato kører når objektet oprettes
    private val date: LocalDate = LocalDate.now()
    private var author: String = author
    private var title: String = title
    private var balance: Int = 1 // Balance starter altid på 1

    // Min "Getters"
    fun getDate(): LocalDate {
        return date
    }

    fun getAuthor(): String {
        return author
    }

    fun getTitle(): String {
        return title
    }

    fun getBalance(): Int {
        return balance
    }

    // Min "Setters"
    fun setAuthor(newAuthor: String) {
        author = newAuthor
    }

    fun setTitle(newTitle: String) {
        title = newTitle
    }

    fun setBalance(newBalance: Int) {
        balance = newBalance
    }

    // Vote functionality
    fun upvote() {
        balance++
    }

    fun downvote() {
        balance--
    }

    // compareTo bruges når vi kalder posts.sorted()
    // Den sammenligner balance mellem to RedditPost-objekter
    override fun compareTo(other: RedditPost): Int {
        return this.balance.compareTo(other.balance)
    }

// Bestemmer hvordan objektet vises når vi printer det
    override fun toString(): String {
        return "Title: $title, Author: $author, Balance: $balance, Date: $date"
    }
}
