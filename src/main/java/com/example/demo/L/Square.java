package com.example.demo.L;

/**
 * Square breaks Liskov substitution principle
 */

public class Square extends Rectangle {
    public Square(int width, int heigth) {
        super(width, heigth);
    }

    public Square(int length) {
        super(length, length);
    }
}
