package com.example.demo.O;

public class Square extends Shape {
    void draw(int x, int y, int r) {
        System.out.println("drawing an square");
        for (int i = 0;i <= x + r; i++) {
            for (int j = 1;j <=y + r; j++) {
                int xSquared = (i - x)*(i - x);
                int ySquared = (j - y)*(j - y);
                if (Math.abs(xSquared + ySquared - r * r) < r) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
