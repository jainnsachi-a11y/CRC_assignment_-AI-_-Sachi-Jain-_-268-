// Check if a number is even or odd (using bitwise operators).
import java.util.Scanner;
public class even_or_odd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        if ((a & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close();
    }
}