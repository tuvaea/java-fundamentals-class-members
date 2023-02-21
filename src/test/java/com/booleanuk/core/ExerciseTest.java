package com.booleanuk.core;

import com.booleanuk.core.Exercise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {
    @Test
    public void shouldSayHelloWorld() {
        Assertions.assertEquals("Hello, world!", Exercise.sayHelloWorld());
    }
}
