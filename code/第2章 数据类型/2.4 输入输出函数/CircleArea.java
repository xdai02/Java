import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.14159;
		double r;
		double area;
		
		System.out.print("ÊäÈë°ë¾¶£º");
		r = scanner.nextDouble();
		area = PI * r * r;
		
		System.out.println(String.format("Ãæ»ý = %.2f", area));
		scanner.close();
	}
}