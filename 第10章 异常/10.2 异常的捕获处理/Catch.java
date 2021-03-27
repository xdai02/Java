import java.util.Scanner;
import java.util.InputMismatchException;

public class Catch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("【除法运算】");
			System.out.print("输入被除数：");
			int num1 = scanner.nextInt();
			System.out.print("输入除数：");
			int num2 = scanner.nextInt();
			int result = num1 / num2;
			System.out.println("结果：" + result);
		} catch(ArithmeticException e) {
			System.err.println("算术异常");
		} catch(InputMismatchException e) {
			System.err.println("输入类型异常");
		} finally {
			scanner.close();
		}
	}
}
