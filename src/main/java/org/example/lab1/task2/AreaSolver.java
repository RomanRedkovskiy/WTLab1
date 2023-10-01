package org.example.lab1.task2;

import org.example.lab1.task2.models.Rectangle;

import java.awt.Point;
import java.util.List;

public class AreaSolver {

    public boolean isDotInArea(Point dot, List<Rectangle> shapes) {
        return shapes.stream().anyMatch(shape -> shape.isPointInRectangle(dot));
    }
}
