import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num, sum = 0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        num = n;
        while (n != 0) {
            int a = n % 10;
            sum += a * a * a; // for 3-digit numbers
            n /= 10;
        }
        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
        sc.close();
    }
}