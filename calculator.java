import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        char op;
        System.out.print("Enter two numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;
            case '-':
                System.out.println("Result = " + (a - b));
                break;
            case '*':
                System.out.println("Result = " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero not allowed");
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}