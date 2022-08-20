package com.practice.testing

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest3 {


    @get:Rule
    var mainActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    // Instrumentation Test
    @Test
    fun testSayHello(){

        val context = ApplicationProvider.getApplicationContext<Context>()

        // Menggunakan class Espresso
        // Mengisi edit text nameEditText dengan "Suardi"
        onView(withId(R.id.nameEditText))
            .perform(typeText("Suardi"))


        // Menekan tombol sayHelloButton
        onView(withId(R.id.sayHelloButton))
            .perform(click())

        // Melakukan pengecekan value dari sayHelloTextView
        onView(withId(R.id.sayHelloTextView))
            .check(matches(withText(context.getString(R.string.sayHelloTextView, "Suardi", "!"))))

    }

}