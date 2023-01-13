public class Geometry {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Rectangle(10, 5),
                new Circle(3),
                new Triangle(3, 4, 5),
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
