package Test;

public class CalculateTriangle {
    public static void main(String[] args) {
        
    }

    public static int calculateTriangleArea(int sideA, int sideB) {
        if(sideA <= 0 || sideB <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        return (sideA * sideB) / 2;
    }

    public void printResult(int number) {
        System.out.println(number);
    }
}
