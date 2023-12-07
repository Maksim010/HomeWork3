package HomeWork5;

import java.util.Scanner;

public class Task4_33 {
    /*. Дано четырехзначное число. Определить:
а) равна ли сумма двух первых его цифр сумме двух его последних цифр;
б) кратна ли трем сумма его цифр;
в) кратно ли четырем произведение его цифр;
г) кратно ли произведение его цифр числу а.*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите 4-значное число ");
        int x= scan.nextInt();
        int x1=x%10;
        int x2=(x/10)%10;
        int x3=(x/100)%10;
        int x4=(x/1000)%10;
        if(x1+x2==x3+x4)
            System.out.println("Суммы равны");
        if ((x1+x2+x4+x3)%3==0)
            System.out.println("Кратно трем");
        if ((x1+x2+x4+x3)%4==0)
            System.out.println("Кратно четырем");
        if  ((x1+x2+x4+x3)%x==0)
            System.out.println("Кратно x");


    }
}
