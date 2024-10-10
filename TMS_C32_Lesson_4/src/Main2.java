import java.util.Scanner;

public class Main2 {

   /* Создайте и заполните массив случайным числами и выведете
    максимальное, минимальное и среднее значение.
    Для генерации случайного числа используйте метод Math.random().
    Пусть будет возможность создавать массив произвольного размера.
    Пусть размер массива вводится с консоли.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            sum += number;
        }

        double average = (double) sum / size;

        System.out.println("Массив случайных чисел: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);



    }
}
