import java.util.Arrays;

public class Main3 {

    /*Создайте 2 массива из 5 чисел.
    Выведите массивы на консоль в двух отдельных строках.
    Посчитайте среднее арифметическое элементов каждого массива и
    сообщите, для какого из массивов это значение оказалось больше
    (либо сообщите, что их средние арифметические равны).*/


    public static void main(String[] args) {

        int[] numbers1 = {1,3,5,7,9};
        int[] numbers2 = {2,4,6,8,10};
        Arrays.sort(numbers1);
        Arrays.sort(numbers2);
        System.out.println("Первый массив: " + Arrays.toString(numbers1));
        System.out.println("Второй массив: " + Arrays.toString(numbers2));

        int sum1 = 0;
        for (int number : numbers1) {
            sum1 += number;
        }

        int sum2 = 0;
        for (int number : numbers2) {
            sum2 += number;
        }
        double average1 = (double) sum1 / numbers1.length;
        double average2 = (double) sum2 / numbers2.length;

        if (average1>=average2){
            System.out.println("Среднее арифметическое первого массива больше или равно  второго массива ");
        }else {
            System.out.println("Среднее арифметическое второго массива больше или равно первого массива");
        }

    }
}