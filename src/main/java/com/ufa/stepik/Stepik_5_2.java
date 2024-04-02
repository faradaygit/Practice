package com.ufa.stepik;

public class Stepik_5_2 {
    public static void main(String[] args) {
        // O(1)  константа
        //      n=10 -> complexity= 1847; n=100 -> complexity= 1847; n=10_000 -> complexity= 1847;
        //      complexity =3;
        //      comlexity = 10000000000;
        // O(logN) Пример - бинарный поиск в отсортированом массиве
        //      n=10 -> complexity 123; n=100 -> complexity=123*7 ; n=10_000 -> complexity= 123 * 13
        //      binary search -> O(logN) -> logN -> n=10000-> 13
        // O(N)
        //      2N , 7N
        //      10 -> 70; 100->700; 10000->70000
        // O(N*logN) Сортировка. Есть теорема, которая доказывает, что сортировка не может быть быстрее.
        //      n=10000 -> 10000*13
        // O(N^2)
        //      n=10000 -> 10000*10000=100_000_000

        //log(100)? ; 128=2^7 ~ 100 ; log(100) = 7
        //log(10_000) > 8 <9 ? ; log(1000)~10; 1024=2^10; *2*2*2


        // quickSort
        // в среднем O(N*logN). O(N^2) в худшем случае

        // merge sort
        // в среднем O(N*logN). O(N*logN) в худшем случае.


        int[] a0 = {1};
        int[] a1 = new int[10];
        int[] a2 = new int[100];
        int[] a3 = new int[1000];

        for (int i = 0; i <a1.length; i++) {
            a1[i] = -i;
        }
        for (int i = 0; i <a2.length; i++) {
            a2[i] = -i;
        }
        for (int i = 0; i <a3.length; i++) {
            a3[i] = -i;
        }


        // n -> c; 10n -> (c^2)

        System.out.println(isSorted(a0));
        System.out.println(isSorted(a1));
        System.out.println(isSorted(a2));
        System.out.println(isSorted(a3));
        System.out.println("Hello2");
    }

    // O(N^2) -> 0.5*N^2=N*2/2
    public static boolean isSorted(int[] array) {
        int count = 0;
        int l = array.length;
        int complexity = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                complexity++;
                if (array[j] >= array[i]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Size: " + l + ". Complexity: " + complexity);
        if ((count == l) || (count == l - 1)) {
            return true;
        } else {
            return false;
        }
    }


}
