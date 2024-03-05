package com.teachmeskills.lesson9.task1;

/**
 * this class contains common fields and methods
 */
public abstract sealed class Figure permits Circle, Rectangle, Triangle {

    public String name;
    public abstract double getArea();
    public abstract double getPerimeter();
}
