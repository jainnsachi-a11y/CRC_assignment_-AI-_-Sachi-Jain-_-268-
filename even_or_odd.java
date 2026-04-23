// Check if a number is even or odd (using modulus operator)
import java.util.Scanner;
public class even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close();
    }
}