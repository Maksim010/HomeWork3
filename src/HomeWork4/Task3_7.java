package HomeWork4;

import java.util.Scanner;

public class Task3_7 {
    public static void main(String[] args) {
        String[] kiril = {"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "х", "ъ", "ф", "ы", "в", "а", "п", "р", "о", "л", "д", "ж", "э", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю"};
        String[] lat = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите букву(Не заглавную)");
        String letter = scan.next();
            for (int i = 0; i <= kiril.length - 1; i++) {
                if (kiril[i].equals(letter))
                    System.out.println("Кирилица");
            }
            for (int i = 0; i <= lat.length - 1; i++) {
                if (lat[i].equals(letter))
                    System.out.println("Латиница");
            }
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i].equals(letter))
                    System.out.println("Цифра");
            }
        }
    }




