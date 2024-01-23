package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PythagorasTest {

    @Test
    void isRightTriangleExc() {
        Assertions.assertEquals(true,Pythagoras.isRightTriangleExc(3,4,5));
    }

    @Test
    void isRightTriangleExcError() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> Pythagoras.isRightTriangleExc(-3, 4, 5));
        assertTrue(exception.getMessage().contains("Incorrect side length"));
    }

}