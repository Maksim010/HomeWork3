package HomeWork3;

import java.util.Scanner;

public class Task3_33e {
    public static void main(String[] args) {
        int x;
        int y;
        boolean b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите два числа");
        x = scan.nextInt();
        y = scan.nextInt();
        b=(x>=1&&x<=4)&&(y>=2&&y<=4);
        System.out.println(b);
    }
}
