package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    void exampleTest1() {
        Assertions.assertTrue(2>1);
    }
    @Test
    void exampleTest2() {
        Assertions.assertTrue(2 > 3);
    }

    @Test
    void exampleTest3() {
        Assertions.assertTrue(23>3);
    }
}
