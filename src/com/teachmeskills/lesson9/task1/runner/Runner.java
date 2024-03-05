package com.teachmeskills.lesson9.task1.runner;

import com.teachmeskills.lesson9.task1.Circle;
import com.teachmeskills.lesson9.task1.Figure;
import com.teachmeskills.lesson9.task1.Rectangle;
import com.teachmeskills.lesson9.task1.Triangle;

/*
Class contains data about objects and loop that prints the result to the console
 */
public class Runner {
    public static void main(String[] args) {

        double Perimeters = 0.0;

        Circle circle = new Circle(49);
        Circle circle2 = new Circle(6);
        Triangle triangle = new Triangle(8, 5, 9, 4);
        Triangle triangle2 = new Triangle(2, 7, 9, 8);
        Rectangle rectangle = new Rectangle(8, 4, 8, 4);

        Figure[] array = new Figure[]{circle, circle2, triangle, triangle2, rectangle};
        for (Figure figures : array) {
            System.out.println("First figure is " + figures.name + " its area is " + figures.getArea());

            Perimeters = Perimeters + figures.getPerimeter();
        }
        System.out.println("the perimeter of all figures is equal " + Perimeters);
    }

}
