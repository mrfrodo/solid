package com.example.demo.L;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testInitializationRecangle() {
        Rectangle rect = new Square(50);
        Assert.assertEquals(50, rect.getWidth());
        Assert.assertEquals(50, rect.getHeight());
    }

    @Test
    @Ignore("class violates Liskov")
    public void testSetWidth() {
        Rectangle square = new Square(50);
        square.setWidth(square, 100);
        Assert.assertEquals(100, square.getWidth());
        Assert.assertEquals(100, square.getHeight());
    }

}
