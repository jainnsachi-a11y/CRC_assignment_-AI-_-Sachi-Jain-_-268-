import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num, sum = 0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        num = n;
        while (n != 0) {
            int a = n % 10;
            int fact = 1;
            for (int i = 1; i <= a; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if (sum == num)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
        sc.close();
    }
}