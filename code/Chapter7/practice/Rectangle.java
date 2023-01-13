public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) throws IllegalArgumentException {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width cannot be negative.");
        }

        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws IllegalArgumentException {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative.");
        }

        this.length = length;
    }

    public double getWidth() {
        return length;
    }

    public void setWidth(double width) throws IllegalArgumentException {
        if (width < 0) {
            throw new IllegalArgumentException("Width cannot be negative.");
        }

        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return String.format(
                "Rectangle: length=%.2f, width=%.2f, area=%.2f, perimeter=%.2f",
                length, width, area(), perimeter()
        );
    }
}
