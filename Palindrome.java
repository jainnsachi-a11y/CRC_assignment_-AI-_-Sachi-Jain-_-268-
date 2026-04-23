import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num, rev = 0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        num = n;
        while (n != 0) {
            int a = n % 10;
            rev = rev * 10 + a;
            n /= 10;
        }
        if (num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}