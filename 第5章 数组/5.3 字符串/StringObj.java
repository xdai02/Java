import java.util.Scanner;

public class StringObj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入字符串：");
        String str = scanner.nextLine();
        System.out.println(str);
        scanner.close();
    }  
}
