package org.example.easy.A058CircleArea;

public class ExerciseA058 {
    public static double areaOfCircle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }

        return (double) Math.round((Math.PI * Math.pow(radius, 2) * 100)) / 100;
    }

    public static void main(String[] args) {
        System.out.println(areaOfCircle(5.0));
        System.out.println(areaOfCircle(3.0));
        System.out.println(areaOfCircle(0.0));
    }
}
