package HomeWork3;

import java.util.Scanner;

public class Task3_32e {
    public static void main(String[] args) {
        int x;
        int y;
        boolean b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите 2 числа.");
        x = scan.nextInt();
        y = scan.nextInt();
        b = ((x >=1)&&(y<=-1))||((x>=2)&&(y>=0));
        System.out.println(b);
    }
}
