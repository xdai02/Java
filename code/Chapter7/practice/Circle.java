public class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }

        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format(
                "Circle: radius=%.2f, area=%.2f, perimeter=%.2f",
                radius, area(), perimeter()
        );
    }
}
