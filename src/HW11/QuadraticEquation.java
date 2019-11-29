package HW11;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    private double D;

      public void quadraticEquation() {

          System.out.println("Решение квадратного уравнения вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите числа a, b и c:");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }

    }
}
