package com.practice.studikasus

import kotlin.random.Random


object Game {

    private val rules: Map<String, Boolean> = mapOf<String, Boolean>(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false,
        "SCISSORS-ROCK" to false
    )

    private val options: List<String> = listOf<String>("ROCK","SCISSORS","PAPER")

    private val optionDrawable: Map<String, Int> = mapOf<String, Int>(
        "ROCK" to R.drawable.batu,
        "PAPER" to R.drawable.kertas,
        "SCISSORS" to R.drawable.gunting
    )

    fun pickRandomOption(): String = options[Random.nextInt(0,3)]

    fun pickDrawable(option: String) : Int = optionDrawable[option]!!

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!
}