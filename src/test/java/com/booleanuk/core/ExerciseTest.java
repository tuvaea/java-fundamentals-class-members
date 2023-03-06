package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

class ExerciseTest {
    Exercise exercise;
    Field[] fields;

    public ExerciseTest() {
        this.exercise = new Exercise();
        fields = this.exercise.getClass().getDeclaredFields();
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
        // Loop through all of the available fields in the Exercise class
        for (Field f : fields) {
            if (f.getName().equals("isVisible")) {
                // Check if the isVisible field is public
                Assertions.assertEquals(0,
                        f.toGenericString().indexOf("public"),
                        "Did you change the isVisible attribute to be public?");
            }
        }
    }
}
