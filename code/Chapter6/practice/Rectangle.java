public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            return;
        }

        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            return;
        }

        this.length = length;
    }

    public double getWidth() {
        return length;
    }

    public void setWidth(double width) {
        if (width < 0) {
            return;
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
