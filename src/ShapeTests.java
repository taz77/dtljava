import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeTests {

    @Test
    public void evaluateTrangle() {
        Triangle triangle = new Triangle(3, 3);
        double result = triangle.getArea();
        assertEquals(4.5, result, 0);

        triangle = new Triangle(2, 3, 4);
        result = triangle.getPerimeter();
        assertEquals(9, result, 0);
    }

    @Test
    public void evaluateCircle() {
        Circle circle = new Circle(2);
        double result = circle.getArea();
        assertEquals(12.57, result, .1);

        circle = new Circle(1);
        result = circle.getPerimeter();
        assertEquals(6.28, result, 0);
    }

    @Test
    public void evaluateRectangle() {
        Rectangle rectangle = new Rectangle(2, 2);
        double result = rectangle.getArea();
        assertEquals(4, result, 0);

        rectangle = new Rectangle(2, 3);
        result = rectangle.getPerimeter();
        assertEquals(10, result, 0);
    }
}