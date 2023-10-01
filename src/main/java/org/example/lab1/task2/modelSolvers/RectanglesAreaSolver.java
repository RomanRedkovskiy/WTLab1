package org.example.lab1.task2.modelSolvers;

import org.example.lab1.task2.AreaSolver;
import org.example.lab1.task2.models.Rectangle;

import java.awt.Point;
import java.util.List;

public class RectanglesAreaSolver {

    private final AreaSolver areaSolver = new AreaSolver();

    private final List<Rectangle> shapes = List.of(
            new Rectangle(new Point(-4, 5), new Point(4, 0)),
            new Rectangle(new Point(-6, 0), new Point(6, -3))
    );

    public boolean isDotInArea(Point dot) {
        return areaSolver.isDotInArea(dot, shapes);
    }
}
