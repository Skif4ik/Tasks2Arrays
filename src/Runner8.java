public class Runner8 {
    public static void main(String[] args) {
        //Дан двумерный массив. Отсортировать строки двумерного массива по
        //возрастанию их сумм элементов

        int[][] intArray = new int[4][5];
        int min = 1, max = 9;

        for (int j = 0; j < intArray.length; j++) {
            for (int i = 0; i < intArray[j].length; i++) {
                intArray[j][i] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
// вывели исходный массив
        for (int j = 0; j < intArray.length; j++) {
            for (int i = 0; i < intArray[j].length; i++) {
                System.out.print(intArray[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
        System.out.println("Суммы строк матрицы");
        // считаем сумму строк  и сравниваем
        int[] sumArra = new int[intArray.length];
        for (int j = 0; j < intArray.length; j++) {
            for (int i = 0; i < intArray[j].length; i++) {
                sumArra[j] += intArray[j][i];
            }
            System.out.println(sumArra[j]);
        }


        int tmp = 0;
        int[] tempRow = null; // для сортировки строк
        for (int j = 0; j < intArray.length - 1; j++) {
            for (int i = 0; i < intArray[j].length - 1 - 1; i++) {
                if (sumArra[i] > sumArra[i + 1]) {
                    tmp = sumArra[i];    // поменяли элементы в массиве сумм!!!!
                    sumArra[i] = sumArra[i + 1];
                    sumArra[i + 1] = tmp;
                    tempRow = intArray[i]; // поменяли строки местами
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = tempRow;
                }
            }
        }

        System.out.println("====================");
        System.out.println("Отсортированная по суммам матрица");
// вывели  отсортированный массив
        for (int j = 0; j < intArray.length; j++) {
            for (int i = 0; i < intArray[j].length; i++) {
                System.out.print(intArray[j][i] + " ");
            }
            System.out.println();
        }

    }
}
