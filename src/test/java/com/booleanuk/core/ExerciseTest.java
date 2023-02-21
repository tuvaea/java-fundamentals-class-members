package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {
    Exercise exercise;

    public ExerciseTest() {
        this.exercise = new Exercise();
    }

    @Test
    public void shouldAnswerTheUltimateQuestion() {
        Assertions.assertEquals(42, this.exercise.answerToTheUltimateQuestion);
    }

    @Test
    public void shouldBeAged32() {
        Assertions.assertEquals(32, this.exercise.age);
    }

    @Test
    public void shouldBeNamedJane() {
        Assertions.assertEquals("Jane", this.exercise.firstName);
    }

    @Test
    public void shouldBeAProgrammer() {
        Assertions.assertTrue(this.exercise.isProgrammer);
    }

    @Test
    public void firstNumberShouldBe9182() {
        Assertions.assertEquals(9182, this.exercise.firstNumber);
    }

    @Test
    public void firstStringShouldBeSpecific() {
        Assertions.assertEquals("Java is to Javascript what car is to carpet.", this.exercise.firstString);
    }

    @Test
    public void isVisibleShouldBePublic() {
        Assertions.assertTrue(this.exercise.isVisible);
    }
}
