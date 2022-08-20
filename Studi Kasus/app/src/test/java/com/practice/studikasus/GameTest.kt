package com.practice.studikasus

import org.junit.Assert
import org.junit.Test

class GameTest {

    @Test
    fun testPickRandomOption(){
        val options = listOf<String>("ROCK","SCISSORS","PAPER")
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
    }

    @Test
    fun testPickDrawable(){
        Assert.assertEquals(R.drawable.kertas, Game.pickDrawable("PAPER"))
        Assert.assertEquals(R.drawable.batu, Game.pickDrawable("ROCK"))
        Assert.assertEquals(R.drawable.gunting, Game.pickDrawable("SCISSORS"))
    }

    @Test
    fun testIsDraw(){
        Assert.assertTrue(Game.isDraw("ROCK", "ROCK"))
        Assert.assertTrue(Game.isDraw("PAPER", "PAPER"))
        Assert.assertTrue(Game.isDraw("SCISSORS", "SCISSORS"))

        Assert.assertFalse(Game.isDraw("ROCK", "PAPER"))
        Assert.assertFalse(Game.isDraw("PAPER", "SCISSORS"))
        Assert.assertFalse(Game.isDraw("SCISSORS", "ROCK"))

    }

    @Test
    fun testIsWin(){
        Assert.assertTrue(Game.isWin("ROCK", "SCISSORS"))
        Assert.assertTrue(Game.isWin("SCISSORS", "PAPER"))
        Assert.assertTrue(Game.isWin("PAPER", "ROCK"))

        Assert.assertFalse(Game.isWin("ROCK", "PAPER"))
        Assert.assertFalse(Game.isWin("SCISSORS", "ROCK"))
        Assert.assertFalse(Game.isWin("PAPER", "SCISSORS"))
    }
}