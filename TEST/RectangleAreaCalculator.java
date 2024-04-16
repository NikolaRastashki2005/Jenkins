package Test;

public class RectangleAreaCalculator {
	 public static int calculateArea(int length, int width) {
	        if(length < 0 || width < 0) {
	            throw new IllegalArgumentException("Sides must be non-negative");
	        }
	        return length * width;
	    }

    void printArea(int a, int b) {
        int area = calculateArea(a, b);
        System.out.println("The area of the rectangle is: " + area);
    }
}
