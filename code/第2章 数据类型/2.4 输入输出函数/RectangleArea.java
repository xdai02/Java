import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double length, width;
		double area;
		
		System.out.print("���볤�ȣ�");
		length = scanner.nextDouble();
		System.out.print("�������ȣ�");
		width = scanner.nextDouble();
		area = length * width;
		
		System.out.println(String.format("���� = %.2f", area));
		scanner.close();
	}
}