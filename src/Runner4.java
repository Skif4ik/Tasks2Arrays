import java.util.Arrays;
import java.util.Scanner;

public class Runner4 {
    public static void main(String[] args) {
        //4. В массиве найти значение и индекс наибольшего из отрицательных элементов.

        int[] arr = null;
        int size = 0, min = -50, max = 50, maxNegative = min, index = -1;


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

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] > maxNegative) {
                maxNegative = arr[i];
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("Нет отрицательных чисел");
        } else {
            System.out.println("Максимальное отрицательное число: " + maxNegative + " Индекс: " + index);
        }


    }
}
