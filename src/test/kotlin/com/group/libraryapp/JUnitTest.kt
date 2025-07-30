package com.group.libraryapp

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JUnitTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("Before All Test")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("After All Test")
        }
    }

    @BeforeEach
    fun beforeEach() {
        println("before Test")
    }

    @AfterEach
    fun afterEach() {
        println("after Test")
    }

    @Test
    fun test1() {
        println("test1")
    }

    @Test
    fun test2() {
        println("test2")
    }
}