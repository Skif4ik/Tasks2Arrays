import java.util.Arrays;

public class Runner1 {
    public static void main(String[] args) {
        //1. В массиве произвольных чисел положительные элементы уменьшить в двое, а
        //отрицательные элементы заменить на значения их индексов.

        int min = -10, max = 10;
        final int SIZE = 10;
        int[] arr1 = new int[SIZE];


        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        System.out.println("Новый массив");
        System.out.println(Arrays.toString(arr1));

        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] > 0) {
                arr1[i] = arr1[i] / 2;

            } else {
                if (arr1[i] < 0) {
                    arr1[i] = i;
                }
            }
        }

        System.out.println("Измененный  массив");
        System.out.println(Arrays.toString(arr1));


    }
}
