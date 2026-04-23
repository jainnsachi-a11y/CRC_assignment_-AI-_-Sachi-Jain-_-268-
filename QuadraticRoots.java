import java.util.Scanner;
public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, root1, root2;
        System.out.print("Enter a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = b*b - 4*a*c;
        if (d > 0) {
            root1 = (-b + Math.sqrt(d)) / (2*a);
            root2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("Real and Different Roots: " + root1 + ", " + root2);
        } else if (d == 0) {
            root1 = -b / (2*a);
            System.out.println("Real and Equal Roots: " + root1);
        } else {
            double real = -b / (2*a);
            double imag = Math.sqrt(-d) / (2*a);
            System.out.println("Complex Roots: " + real + " ± " + imag + "i");
        }
        sc.close();
    }
}