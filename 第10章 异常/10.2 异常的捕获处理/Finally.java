import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = {0, 1, 2, 3, 4};
		try {
			System.out.print("���������ݣ�");
			arr[5] = scanner.nextInt();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�����±�Խ���쳣����������");
		} finally {
			System.out.println("�ر�������...");
			scanner.close();
		}
	}
}
