package com.teachmeskills.lesson9.task1;

/**
 * class contains information about the circle
 */
public final class Circle extends Figure {

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
