import java.util.Scanner;
public class Convert_temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c, f;
        System.out.print("Enter temperature in Celsius: ");
        c = sc.nextFloat();
        f = (c * 9/5) + 32;
        System.out.println("Fahrenheit = " + f);
        System.out.print("Enter temperature in Fahrenheit: ");
        f = sc.nextFloat();
        c = (f - 32) * 5/9;
        System.out.println("Celsius = " + c);
        sc.close();
    }
}