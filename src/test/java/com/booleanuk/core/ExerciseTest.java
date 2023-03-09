package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import java.lang.reflect.Field;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ExerciseTest {
    Exercise exercise;
    Field[] fields;

    public ExerciseTest() {
        this.exercise = new Exercise();
        fields = this.exercise.getClass().getDeclaredFields();
    }

    @Test
    @Order(1)
    public void shouldAnswerTheUltimateQuestion() {
        Assertions.assertEquals(42, this.exercise.answerToTheUltimateQuestion);
    }

    @Test
    @Order(2)
    public void shouldBeAged32() {
        Assertions.assertEquals(32, this.exercise.age);
    }

    @Test
    @Order(3)
    public void shouldBeNamedJane() {
        Assertions.assertEquals("Jane", this.exercise.firstName);
    }

    @Test
    @Order(4)
    public void shouldBeAProgrammer() {
        Assertions.assertTrue(this.exercise.isProgrammer);
    }

    @Test
    @Order(5)
    public void firstNumberShouldBe9182() {
        Assertions.assertEquals(9182, this.exercise.firstNumber);
    }

    @Test
    @Order(6)
    public void firstStringShouldBeSpecific() {
        Assertions.assertEquals("Java is to Javascript what car is to carpet.", this.exercise.firstString);
    }

    @Test
    @Order(7)
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
