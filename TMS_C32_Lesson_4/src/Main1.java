import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    /*Создайте массив целых чисел. Удалите все вхождения заданного
    числа из массива.
    Пусть число задается с консоли (класс Scanner). Если такого числа нет -
    выведите сообщения об этом.
    В результате должен быть новый массив без указанного числа.*/

    public static void main(String[] args) {

        int[] numbers = {3,8,12,25,40,12,56,12,90};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для удаления из массива: ");
        int numberRemove = scanner.nextInt();

        boolean found = false;
        for (int number : numbers) {
            if (number == numberRemove) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Число " + numberRemove + " не найдено в массиве.");
        } else {
            int count = 0;
            for (int number : numbers) {
                if (number == numberRemove) {
                    count++;
                }
            }

            int[] newArray = new int[numbers.length - count];
            int index = 0;
            for (int number : numbers) {
                if (number != numberRemove) {
                    newArray[index++] = number;
                }
            }

            System.out.println("Массив после удаления числа " + Arrays.toString(newArray));
        }
    }
}