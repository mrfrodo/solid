package com.example.demo.O;

import com.example.demo.S.EmployeeV2;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DrawAllShapesTest {

    @Test
    public void shouldDrawShape() {
        Shape shape = new Square();
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(shape);

        DrawAllShapes das = new DrawAllShapes();
        das.drawAllShapes(shapeList);
    }
}
