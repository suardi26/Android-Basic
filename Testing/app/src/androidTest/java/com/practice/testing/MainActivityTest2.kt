package com.practice.testing

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest2 {

    // Menggunakan ActivityScenarioRule dimana pada saat pertama kali test dijalankan maka akan
    // Menjalankan ActivityScenario dari MainActivity dan akan ditutup ketika selesai menjalankan
    // test secara otomatis dengan bantuan ActivityScenarioRule.

    @get:Rule
    var mainActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    // Instrumentation Test (ActivityScenarioRule)
    @Test
    fun testBlank(){

    }
}