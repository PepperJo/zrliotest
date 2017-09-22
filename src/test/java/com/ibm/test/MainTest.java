package com.ibm.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;

    @BeforeEach
    void setUp() {
        System.err.println("setUp");
        main = new Main();
    }

    @AfterEach
    void tearDown() {
        System.err.println("tearDown");
    }

    @Test
    void abc() {
        assertEquals(15, main.abc());
    }

    @Test
    void foo() {
        assertEquals("test1", main.foo());
    }

    @Test
    void timesTwo() {
        long a = new Random().nextLong();
        assertEquals(a * 2, main.timesTwo(a));
    }

}