package HomeWork5;

import java.util.Scanner;

public class Task4_23 {
    public static void main(String[] args) {
        /*Дано двузначное число. Определить:
а) какая из его цифр больше: первая или вторая;
б) одинаковы ли его цифры*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите 2-значное число ");
        int x= scan.nextInt();
        int x1=x/10;
        int x2=x%10;
        if(x1>x2)
            System.out.println("Первая больше");
        else if (x2>x1)
            System.out.println("Вторая больше");
        if(x1==x2)
            System.out.println("Они равны");

    }
}
