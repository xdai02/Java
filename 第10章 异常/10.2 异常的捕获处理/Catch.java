import java.util.Scanner;
import java.util.InputMismatchException;

public class Catch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("���������㡿");
			System.out.print("���뱻������");
			int num1 = scanner.nextInt();
			System.out.print("���������");
			int num2 = scanner.nextInt();
			int result = num1 / num2;
			System.out.println("�����" + result);
		} catch(ArithmeticException e) {
			System.err.println("�����쳣");
		} catch(InputMismatchException e) {
			System.err.println("���������쳣");
		} finally {
			scanner.close();
		}
	}
}
