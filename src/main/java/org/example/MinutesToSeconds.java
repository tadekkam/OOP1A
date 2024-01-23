package org.example;

public class MinutesToSeconds {

    protected static int convert(int minutes) {
        if (minutes < 0) {
            return 0;
        } else
            return minutes * 60;
    }
}
