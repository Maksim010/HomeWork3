package HomeWork3;

import java.util.Scanner;

public class Task3_33c {
    public static void main(String[] args) {
        int x;
        int y;
        boolean b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите два числа");
        x = scan.nextInt();
        y = scan.nextInt();
        b=(y>=1)||((y<=-3)&&(y>=-4))&&(x>=0||x<=0);
        System.out.println(b);
    }
}
