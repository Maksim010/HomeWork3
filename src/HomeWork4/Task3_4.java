package HomeWork4;

import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        int x,y;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите координаты ");
        x= scan.nextInt();
        y= scan.nextInt();
        if(x>0&&y>0)
            System.out.println("В 1 плоскоти");
        else if (x<0&&y>0)
            System.out.println("Во 2 плоскости");
        else if(x<0&&y<0)
            System.out.println("В 3 плоскости");
        else if (x>0&&y<0)
            System.out.println("В 4 плоскоти");
        else
            System.out.println("Точка координат находится в нескольких плоскостях");

        }


    }

