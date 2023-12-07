package HomeWork5;

import java.util.Scanner;
public class Task4_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размеры стола (a b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Введите размеры прямоугольников (c d): ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int count1 = (a / c) * (b / d);   // количество прямоугольников при размещении вдоль длинной стороны стола
        int count2 = (a / d) * (b / c);   // количество прямоугольников при размещении вдоль короткой стороны стола

        if (count1 > count2) {
            System.out.println("Больше прямоугольников можно разместить при размещении вдоль длинной стороны стола");
        } else if (count1 < count2) {
            System.out.println("Больше прямоугольников можно разместить при размещении вдоль короткой стороны стола");
        } else {
            System.out.println("Количество прямоугольников одинаково в обоих случаях");
        }
    }
}

