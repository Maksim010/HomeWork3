package HomeWork3;

import java.util.Scanner;

public class Task3_33g {
    public static void main(String[] args) {
        int x;
        int y;
        boolean b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите два числа");
        x = scan.nextInt();
        y = scan.nextInt();
        b=(x>=1&&x<=3)&&(y<=1&&y>=-3);
        System.out.println(b);
    }
}
