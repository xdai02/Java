import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double length, width;
		double area;
		
		System.out.print("输入长度：");
		length = scanner.nextDouble();
		System.out.print("输入宽度：");
		width = scanner.nextDouble();
		area = length * width;
		
		System.out.println(String.format("面积 = %.2f", area));
		scanner.close();
	}
}