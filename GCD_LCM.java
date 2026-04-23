import java.util.Scanner;
public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, gcd, lcm;
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        gcd = x;
        lcm = (a * b) / gcd;
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
        sc.close();
    }
}