package com.group.libraryapp

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JunitTest {

    @BeforeEach
    fun init() {
        println("init")
    }

    @Test
    fun test1() {
        println("test1")
    }
}