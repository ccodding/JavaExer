package D_1013;

import java.util.Arrays;

public class BubbleSort02 {

    public int[] sorting(int[] arr, int j){
        for(int i = j+1; i < arr.length; i++){
            System.out.println(arr[i]); // 7 vs 2
            if (arr[j] > arr[i]){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {7, 2, 3, 9, 28, 11};
        // 오름차순 또는 내림차순으로 정렬하는 알고리즘
        BubbleSort02 bs = new BubbleSort02();
        int[] result = bs.sorting(arr, 0);
        result = bs.sorting(new int[]{2,7,3,9,28,11}, 1);
        System.out.println(Arrays.toString(result));
        result = bs.sorting(new int[]{2,7,3,9,28,11}, 2);
        System.out.println(Arrays.toString(result));
        result = bs.sorting(new int[]{2,7,3,9,28,11}, 3);
        System.out.println(Arrays.toString(result));
        result = bs.sorting(new int[]{2,7,3,9,28,11}, 4);
        System.out.println(Arrays.toString(result));
        result = bs.sorting(new int[]{2,7,3,9,28,11}, 5);
        System.out.println(Arrays.toString(result));
    }
}