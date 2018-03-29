public class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * (this.radius * this.radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }
}