package org.example;

public class Pythagoras {

    private static int getSquare(int number) {
        return number * number;
    }

    protected static boolean isRightTriangleExc (int a, int b, int c) {
        if (a<=0 || b<=0 || c<=0)
            throw new IllegalArgumentException("Incorrect side length");
        if (getSquare(a) + getSquare(b) != getSquare(c))
            return false;
        return true;
    }


}
