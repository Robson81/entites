package _0entities;

public class Retangle {

	public double width;

	public double height;

	public double area() {

		return width * height;
	}

	public double diagonal() {

		return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
	}

	public double perimeter() {

		return 2 * (width + height);
	}

	public String toString() {

		return String.format("Area: %.2f", area()) + String.format("\nPerimeter: %.2f", perimeter()) + String.format("\nDiagonal: %.2f", diagonal());
	}

}
