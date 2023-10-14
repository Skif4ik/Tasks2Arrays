import java.util.Arrays;
import java.util.Scanner;

public class Runner3 {
    public static void main(String[] args) {
        //3. Дан массив. Все элементы массива расположить в обратном порядке.

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


        System.out.println("Элементы массива в обратном порядке");// запустили цикл с двух строн в середине встретились
        for (int i = 0, j = arr.length - 1; j > i; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}