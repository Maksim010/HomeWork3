package HomeWork5;

import java.util.Scanner;
/*Известны два расстояния: одно в километрах, другое — в футах
        (
        1 фут 0,305 м
        ). Какое из расстояний меньше?*/

public class Task4_8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите два расстояния. Первое в киллометрах,второе в футах ");
        int x= scan.nextInt();
        int y= scan.nextInt();
        double fut=0.305*y;
        if(x<fut)
            System.out.println(" в киллометрах меньше");
        else
             System.out.println("в футах меньше");
    }
}
