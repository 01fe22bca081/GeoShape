/**
 * The geoshape class provides methods to calculate the area of various geometric shapes such as
 * triangles, rectangles, circles, and squares.
 */
package Sem4.DevOps.GeoShape;

public class geoshape {
    
    // triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // square
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    /**
     * The main function calculates and prints the areas of a triangle, rectangle, circle, and square.
     */
    public static void main(String[] args) {
        // Main class
        double triangleArea = calculateTriangleArea(5, 8);
        System.out.println("Area of Triangle: " + triangleArea);

        double rectangleArea = calculateRectangleArea(4, 6);
        System.out.println("Area of Rectangle: " + rectangleArea);

        double circleArea = calculateCircleArea(3);
        System.out.println("Area of Circle: " + circleArea);

        double squareArea = calculateSquareArea(4);
        System.out.println("Area of Square: " + squareArea);
    }
}


