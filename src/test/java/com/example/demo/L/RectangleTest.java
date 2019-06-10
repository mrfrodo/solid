package com.example.demo.L;

import com.example.demo.L.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testInitializationRecangle() {
        Rectangle rect = new Rectangle(50, 20);
        Assert.assertEquals(50, rect.getWidth());
        Assert.assertEquals(20, rect.getHeight());
    }

    @Test
    public void testSetWidth() {
        Rectangle rect = new Rectangle(50, 20);
        rect.setWidth(rect, 100);
        Assert.assertEquals(20, rect.getHeight());
        Assert.assertEquals(100, rect.getWidth());
        rect.setWidth(rect, 200);
        Assert.assertEquals(20, rect.getHeight());
        Assert.assertEquals(200, rect.getWidth());
    }
}
