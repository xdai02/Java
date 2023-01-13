import java.util.Arrays;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            return;
        }

        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            return;
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double[] getSides() {
        return new double[]{side1, side2, side3};
    }

    public void setSides(double side1, double side2, double side3) {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            return;
        }

        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            return;
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return String.format(
                "Triangle: sides2=%s, area=%.2f, perimeter=%.2f",
                Arrays.toString(getSides()), area(), perimeter()
        );
    }
}
