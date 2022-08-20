package com.practice.testing

import org.junit.Assert
import org.junit.Test

class HelloTest {

    // Membuat unit test / local test
    @Test
    fun testSayHello(){
        val result: String = Hello.sayHello("Suardi")

        Assert.assertEquals("Hello Suardi", result)
    }
}