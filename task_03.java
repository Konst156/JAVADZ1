// Реализовать простой калькулятор Scanner sc = ... int a = sc.nextLine int b = sc.nextLine

import java.util.Scanner;

public class task_03 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите операцию (+, -, *, /): ");
        String c = input.nextLine();
        System.out.print("Введите целое число a: ");
        double a = input.nextDouble();
        System.out.print("Введите целое число b: ");
        double b = input.nextDouble();
        // System.out.printf("%d + %d = %d \n", a, b, (a+b));
        input.close();

        if (c.equals("+")){
            System.out.printf("%f + %f = %f \n", a, b, a+b);
        }
        if (c.equals("-")){
            System.out.printf("%f - %f = %f \n", a, b, a-b);
        }
        if (c.equals("*")){
            System.out.printf("%f * %f = %f \n", a, b, a*b);
        }
        if (c.equals("/")){
            System.out.printf("%f / %f = %f \n", a, b, (a/b));
        }
    }
}
