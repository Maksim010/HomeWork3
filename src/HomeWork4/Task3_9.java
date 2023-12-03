package HomeWork4;

import java.util.Scanner;

public class Task3_9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x1,y1,x2,y2;
        x1= scan.nextInt();
        y1= scan.nextInt();
        x2= scan.nextInt();
        y2= scan.nextInt();
        if(y1<y2&&x1!=x2)
            System.out.println("Подъем");
        else if(y1>y2&&x1!=x2)
            System.out.println("Спуск");
        else if(y1==y2&&x1!=x2)
            System.out.println("Ровная дорога");
        else if (x1==x2)
            System.out.println("Отвесная дорога");

    }
}
