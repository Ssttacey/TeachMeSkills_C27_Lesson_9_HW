package com.teachmeskills.lesson9.task1;

import com.teachmeskills.lesson9.task1.Figure;

/**
 * class contains information about the rectangle
 */
public final class Rectangle extends Figure {

    public int side1;
    public int side2;
    public int side3;
    public int side4;

    public Rectangle(int side1, int side2, int side3, int side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.name = "Rectangle";

    }

    @Override
    public double getArea() {
        double area = side1 * side2;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = side1 + side2 + side3 + side4;
        return perimeter;
    }
}
