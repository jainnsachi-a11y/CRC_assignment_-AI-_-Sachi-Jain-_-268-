import java.util.Scanner;
public class Read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        float b;
        char c;
         System.out.println("Enter integer, float and char:");
        a = sc.nextInt();
        b = sc.nextFloat();
        c = sc.next().charAt(0);
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Char: " + c);
        sc.close();
    }
}