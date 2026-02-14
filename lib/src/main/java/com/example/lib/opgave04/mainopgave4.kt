package com.example.lib.opgave04

fun main() {

    val words = listOf(
        "apple", "banana", "apple", "orange", "banana",
        "apple", "orange", "banana", "apple", "banana",
        "apple", "orange", "banana", "banana", "apple",
        "orange", "apple", "orange", "banana"
    )

    // Laves mutableMap
    // Key = ord
    // Value = antal gange ordet forekommer
    val frequency = mutableMapOf<String, Int>()

    // Går igennem alle ord i listen
    for (word in words) {

        if (frequency.containsKey(word)) {
            frequency[word] = frequency[word]!! + 1 // Tager nuværende værdi og lægger 1 til
        } else {
            frequency[word] = 1 // Hvis ordet ikke findes så starter den bare på 1
        }
    }

    for ((key, value) in frequency) {
        println("$key: $value")
    }
}
