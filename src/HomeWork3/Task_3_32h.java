package HomeWork3;

import java.util.Scanner;

public class Task_3_32h {
    public static void main(String[] args) {
            double x;
            double y;
            boolean b;
            Scanner scan=new Scanner(System.in);
            System.out.println("Введите два числа");
            x = scan.nextDouble();
            y = scan.nextDouble();
            if(x<2) {
                b = y >= 0.5 && y <= 1.5;
                System.out.println(b);
            }
            else if(x>=2) {
                b = y >= 1. || y <= 1;
                System.out.println(b);
            }
    }
}
