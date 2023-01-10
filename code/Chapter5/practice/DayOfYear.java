import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year, month, day: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        scanner.close();

        System.out.println(dayOfYear(year, month, day));
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int daysInMonth(int year, int month) {
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = isLeap(year) ? 29 : 28;
                break;
            default:
                days = 0;
                break;
        }
        return days;
    }

    public static int dayOfYear(int year, int month, int day) {
        int days = 0;
        for (int i = 1; i < month; i++) {
            days += daysInMonth(year, i);
        }
        days += day;
        return days;
    }

}
