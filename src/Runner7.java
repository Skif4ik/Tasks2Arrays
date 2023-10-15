import java.util.Arrays;
import java.util.Comparator;

public class Runner7 {
    public static void main(String[] args) {
        //7. Даны 2 массива. Получить третий массив из отрицательных элементов первого,
        //кратных трем, и четных положительных элементов второго. Полученный массив
        //отсортировать по убыванию.

        int[] arr1 = {1, 2, -9, 4, -3};
        int[] arr2 = {-11, -33, -22, 44, 55};
        int[] resArr = new int[arr1.length + arr2.length];


        int iRes = 0;
        // отсортировали
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0 && arr1[i] % 3 == 0) {
                resArr[iRes++] = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 0 && arr2[i] % 2 == 0) {
                resArr[iRes++] = arr2[i];
            }
        }
        System.out.println("Исходные массивы");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println();
        System.out.println("=======================================");
        System.out.println("Новый массив");
        System.out.println(Arrays.toString(resArr));

        resArr = Arrays.copyOf(resArr, iRes); // избавляемся от нолей
        System.out.println();
        System.out.println("=======================================");
        System.out.println(" избавляемся от нолей");

        Arrays.sort(resArr);

        System.out.println("По убыванию " + Arrays.toString(resArr));
    }
}
