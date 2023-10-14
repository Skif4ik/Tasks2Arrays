import java.util.Arrays;

public class Runner2 {
    public static void main(String[] args) {
        //2. Дан массив. Найти сумму элементов с четными номерами и отдельно – с
        //нечетными номерами.

        int min = 1, max = 15, sumPositive = 0, sumNegative = 0;
        final int SIZE = 10;
        int[] arr1 = new int[SIZE];


        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        System.out.println("Новый массив");
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            if ((i + 1) % 2 == 0) {//четные делятся на 2
                sumPositive = sumPositive + arr1[i];
            } else {
                sumNegative = sumNegative + arr1[i];
            }


        }
        System.out.println("Сумма четных: " + sumPositive + ", Сумма нечетных: " + sumNegative);


    }
}
