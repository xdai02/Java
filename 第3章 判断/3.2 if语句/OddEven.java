import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
	    
		System.out.print("����һ����������");
		num = scanner.nextInt();
	    
	    if(num > 0) {
	        if(num % 2 == 0) {
	        	System.out.println(num + "��ż��");
	        } else {
	        	System.out.println(num + "������");
	        }
	    }
	    
	    scanner.close();
	}
}
