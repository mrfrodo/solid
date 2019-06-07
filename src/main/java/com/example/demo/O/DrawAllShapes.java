package com.example.demo.O;

import java.util.List;

/**
 * Open closes principle. A class should be open for extension, but closed for modification
 */

public class DrawAllShapes {

    void drawAllShapes(List<Shape> shapes) {
        for (Shape s: shapes) {
            s.draw(1,2,3);
        }
    }
}
