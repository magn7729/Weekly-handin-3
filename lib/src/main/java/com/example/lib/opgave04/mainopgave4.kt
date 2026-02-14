package com.example.lib.opgave04

fun main() {

    val words = listOf(
        "apple", "banana", "apple", "orange", "banana",
        "apple", "orange", "banana", "apple", "banana",
        "apple", "orange", "banana", "banana", "apple",
        "orange", "apple", "orange", "banana"
    )

    val frequency = mutableMapOf<String, Int>()

    for (word in words) {

        if (frequency.containsKey(word)) {
            frequency[word] = frequency[word]!! + 1
        } else {
            frequency[word] = 1
        }
    }

    for ((key, value) in frequency) {
        println("$key: $value")
    }
}
