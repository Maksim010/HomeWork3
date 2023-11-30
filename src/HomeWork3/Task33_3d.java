package HomeWork3;

import java.util.Scanner;

public class Task33_3d {
    public static void main(String[] args) {
        double x;
        double y;
        boolean b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите два числа");
        x = scan.nextDouble();
        y = scan.nextDouble();
        b=(x>=-1&&x<=1.5)&&(y>=-0.5&&y<=1.5);
        System.out.println(b);
    }
}
