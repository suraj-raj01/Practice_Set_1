package DayFromDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int date,month,year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date: ");
        date = sc.nextInt();
        System.out.println("Enter the month: ");
        month = sc.nextInt();
        System.out.println("Enter the year: ");
        year = sc.nextInt();
        String result = DayFromDate.dayFromDate(date,month,year);
        System.out.println(result);
    }
}
