package com.example.myproject;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        String expectedOutput = "Hello from Gradle project!";
        assertEquals(expectedOutput, Main.getMessage()); // Replace with your actual method
    }
}

