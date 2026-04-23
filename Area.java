import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, area, circumference;
        System.out.print("Enter radius: ");
        r = sc.nextDouble();
        area = Math.PI * r * r;
        circumference = 2 * Math.PI * r;
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
        sc.close();
    }
}