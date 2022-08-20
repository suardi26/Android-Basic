package com.practice.testing

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    lateinit var activityScenario: ActivityScenario<MainActivity>

    @Before
    fun setUp(){
        activityScenario = ActivityScenario.launch(MainActivity::class.java)

    }

    // Instrumentation Test
    @Test
    fun testBlank(){

    }

    @After
    fun tearDown(){
        activityScenario.close()
    }
}