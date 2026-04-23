import java.util.Scanner;
public class Compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p, r, t, si, ci;
        System.out.print("Enter principal, rate, time: ");
        p = sc.nextDouble();
        r = sc.nextDouble();
        t = sc.nextDouble();
        si = (p * r * t) / 100;
        ci = p * Math.pow((1 + r/100), t) - p;
        System.out.println("Simple Interest = " + si);
        System.out.println("Compound Interest = " + ci);
        sc.close();
    }
}