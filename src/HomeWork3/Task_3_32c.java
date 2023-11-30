package HomeWork3;

import java.util.Scanner;

public class Task_3_32c {
    public static void main(String[] args) {
        int x;
        int y;
        boolean b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите два числа");
        x = scan.nextInt();
        y = scan.nextInt();
        b=(x>=1)&&(x<=2)&&(y>=1)&&(y<=4);
        System.out.println(b);
    }
}
