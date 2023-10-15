import java.util.Arrays;
import java.util.Scanner;

public class Runner5 {
    public static void main(String[] args) {
        //5. Дан массив. Определить среднее арифметическое кратных 5 и некратных 10.

        int[] arr = null;
        int size = 0, min = 1, max = 15;

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        size = scaner.nextInt();
        while (size < 0) {
            System.out.println("Недопустимый размер");
            size = scaner.nextInt();
        }

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println("Новый массив");
        System.out.println(Arrays.toString(arr));

        int counter = 0;
        int summEl = 0;
        double rez = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 10 != 0) {
                summEl = summEl + arr[i];
                counter++;

            }

        }

        if(counter !=0) {
            rez = (double) summEl / counter;
            System.out.println("Среднее арифмитическое кратных 5 и некратных 10 равно: " + rez);
        }else
            System.out.println("Нет подходящих условию элементов");

    }
}
