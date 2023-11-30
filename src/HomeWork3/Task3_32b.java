package HomeWork3;

import java.util.Scanner;

public class Task3_32b {
    public static void main(String[] args) {
        int x;
        double y;
        boolean b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите два числа");
        x = scan.nextInt();
        y = scan.nextDouble();
        b=(y<=1.5)&&(x>=0)&&(y>=-2)||(y<=1.5)&&(x<=0)&&(y>=-2);
        System.out.println(b);
    }
}
