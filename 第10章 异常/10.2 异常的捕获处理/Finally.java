import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = {0, 1, 2, 3, 4};
		try {
			System.out.print("输入新数据：");
			arr[5] = scanner.nextInt();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界异常被捕获处理了");
		} finally {
			System.out.println("关闭输入流...");
			scanner.close();
		}
	}
}
