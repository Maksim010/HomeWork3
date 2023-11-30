package HomeWork3;

import java.util.Scanner;

public class Task3_33h {
    public static void main(String[] args) {
        double x;
        int y;
        boolean b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите два числа");
        x = scan.nextInt();
        y = scan.nextInt();
        b=(x>=1&&x<=2.5&&y>=-2)||(x>=0&&x<=0&&y>=1.5);
        System.out.println(b);
    }
}
