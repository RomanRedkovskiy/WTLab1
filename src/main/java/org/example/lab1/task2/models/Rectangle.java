package org.example.lab1.task2.models;

import java.awt.Point;

public record Rectangle(Point topLeftPoint, Point bottomRightPoint) {

    public boolean isPointInRectangle(Point dot) {
        return dot.x >= topLeftPoint.x && dot.y <= topLeftPoint.y  &&
                dot.x <= bottomRightPoint.x && dot.y >= bottomRightPoint.y;
    }
}
