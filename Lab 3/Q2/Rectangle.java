//Q2. Create a Rectangle class with data members for length and breadth. Write methods to calculate the area and perimeter of the rectangle.

import java.util.Scanner;

public class Rectangle {
    double length;
    double breadth;

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length: ");
        length = scanner.nextDouble();
        System.out.print("Enter Breadth: ");
        breadth = scanner.nextDouble();
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.acceptDetails();

        System.out.println("\nArea: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
