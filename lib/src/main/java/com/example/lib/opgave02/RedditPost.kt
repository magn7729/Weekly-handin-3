package com.example.lib.opgave02

import java.time.LocalDate

class RedditPost(
    author: String,
    title: String
) : Comparable<RedditPost> {

    // Private attributes
    private val date: LocalDate = LocalDate.now()
    private var author: String = author
    private var title: String = title
    private var balance: Int = 1

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

    // Sorting
    override fun compareTo(other: RedditPost): Int {
        return this.balance.compareTo(other.balance)
    }

    override fun toString(): String {
        return "Title: $title, Author: $author, Balance: $balance, Date: $date"
    }
}
