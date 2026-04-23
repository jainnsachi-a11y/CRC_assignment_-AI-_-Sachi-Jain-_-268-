import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
        }
        sc.close();
    }
}