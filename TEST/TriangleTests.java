package Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTests {
    @Test
    void testCalculateTriangleArea() {
        assertEquals(10, CalculateTriangle.calculateTriangleArea(5, 4));
    }

    @Test
    void testInvalidInputTriangle() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculateTriangle.calculateTriangleArea(-1, 5);
        });
    }
    
    @Test
    void testCalculateRectangleArea() {
        assertEquals(20, RectangleAreaCalculator.calculateArea(5, 4));
    }

    @Test
    void testInvalidInputRectangle() {
        assertThrows(IllegalArgumentException.class, () -> {
            RectangleAreaCalculator.calculateArea(-1, 5);
        });
    }
}