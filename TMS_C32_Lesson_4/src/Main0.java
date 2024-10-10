import java.util.Scanner;

public class Main0 {

   /* Создайте массив целых чисел. Напишете программу, которая выводит
    сообщение о том, входит ли заданное число в массив или нет.
    Пусть число для поиска задается с консоли (класс Scanner).*/


    public static void main(String[] args) {

        int[] numbers = {3,5,10,14,16,17,20};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для поиска в массиве от 1 до 20: ");
        int userInput = scanner.nextInt();

        boolean found = false;

        for (int number : numbers) {
            if (number == userInput) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("оно есть.");
        } else {
            System.out.println("его нет.");
        }
    }
}
