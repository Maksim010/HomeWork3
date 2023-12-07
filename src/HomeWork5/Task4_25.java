package HomeWork5;

import java.util.Scanner;
/*Дано двузначное число. Определить:
        а) является ли сумма его цифр двузначным числом;
        б) больше ли числа а сумма его цифр.*/

public class Task4_25 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите 2-значное число ");
        int x= scan.nextInt();
        int x1=x%10;
        int x2=(x/10)%10;
        if((x1+x2)>9)
            System.out.println("2-значное");
        if ((x1+x2)>x)
            System.out.println("Cумма чисел больше");
        else
            System.out.println("Сумма чисел меньше");
    }
}
