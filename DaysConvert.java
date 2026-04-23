import java.util.Scanner;
public class DaysConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days, years, weeks, remainingDays;
        System.out.print("Enter number of days: ");
        days = sc.nextInt();
        years = days / 365;
        days = days % 365;
        weeks = days / 7;
        remainingDays = days % 7;
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + remainingDays);
        sc.close();
    }
}