package com.example.demo.L;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.height = heigth;
    }

    public void setWidth(Rectangle rect, int width)  {
        rect.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
