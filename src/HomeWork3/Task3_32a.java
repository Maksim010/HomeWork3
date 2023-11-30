package HomeWork3;

import java.util.Scanner;

public class Task3_32a {
    public static void main(String[] args) {
        int x;
        int y;
        boolean b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите два числа");
        x = scan.nextInt();
        y = scan.nextInt();
        b=(x>=-2)&&(y>=1);
        System.out.println(b);
    }
}
