package HomeWork4;

import java.util.Scanner;

public class Task3_10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер квартиры: ");
            int n = scanner.nextInt();
            System.out.print("Введите количество квартир на этаже: ");
            int m = scanner.nextInt();
            int floats=(n-1)/m+1;
            int entrance=(floats-1)/9+1;
            System.out.println("Номер подъезда: "+entrance);
        }
    }


