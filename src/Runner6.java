import java.util.Arrays;
import java.util.Scanner;

public class Runner6 {
    public static void main(String[] args) {
       //6. Дан массив. Переписать его положительные элементы во второй массив, а
        //остальные — в третий.

        int[] arr = null;
        int size = 0, min = -15, max = 15;
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




        int[] arr2 = new int[arr.length];// если все положительные
        int[] arr3 = new int[arr.length];
        int i2 = 0, i3 = 0; // переменные для индекса

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr2[i2++] = arr[i];// увеличиваем чтобы подготовить место для следующего индекса
            } else {
                arr3[i3++] = arr[i];
            }
        }
        System.out.println("Исходный массив " + Arrays.toString(arr));
        System.out.println("С положительными элементами " + Arrays.toString(arr2));
        System.out.println("С отрицательными элементами" + Arrays.toString(arr3));

        System.out.println("================= избавляемся от нулей ======================");

        arr2 = Arrays.copyOf(arr2, i2); // избавляемся от нулей
        arr3 = Arrays.copyOf(arr3, i3);

        System.out.println("С положительными элементами " + Arrays.toString(arr2));
        System.out.println("С отрицательными элементами" + Arrays.toString(arr3));
    }
}
