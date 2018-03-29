public class Triangle implements Shape {

    double base;
    double height;
    double firstSide;
    double secondSide;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    Triangle(double firstSide, double secondSide, double base) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.base = base;
    }

    @Override
    public double getArea() {
        return (this.height * this.base) / 2;
    }

    @Override
    public double getPerimeter() {
        return this.firstSide + this.base + this.secondSide;
    }
}
