import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArraySearch {
    public static void main(String[] args) {
       int[] arr = {1, 3, 46, 1, -4, 7, -32};

        ArraySearch arraySearch = new ArraySearch(arr);
        System.out.println(arraySearch.positionOf(1));
    }

    private final int[] arr;

    ArraySearch(int[] arr) {
        Arrays.sort(arr);
        this.arr = arr;
    }

    int findMax() {
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    int findMin() {
        int minValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    boolean contains(int e) {

        boolean b = false;
        int index = Integer.MAX_VALUE;
        int right = arr.length-1;
        int left = 0;
        int key = e;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
             if(arr[mid]<key){
                 left = mid + 1;
             } else if (arr[mid] > key) {
                 right = mid - 1;
             } else if (arr[mid] ==key) {
                 index = mid;
                 b=true;
                 break;
             }

        }
          return b;

    }

    int positionOf(int e) {
        ArrayList<Integer>list= new ArrayList<>();
        int index =0;
        for(int i = 0 ; i<arr.length; i++){
            if(e==arr[i]){
                index = i;
                list.add(index);

            }

        }
        if(list.isEmpty()){
            return 0;
        }

       return list.get(0);
    }
}