public class Leap {
    public static void main(String[] args) {
        for (int year = 1970; year <= 2030; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.print(year + " ");
            }
        }
    }
}
