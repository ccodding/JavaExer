package D_1013;

import java.util.Arrays;

public class BubbleSort03 {

    public int[] sorting(int[] arr){
       for(int j = 0; j < arr.length - 1; j++){
           for(int i = j + 1; i < arr.length; i++){
                if(arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {7, 2, 3, 9, 28, 11};
        // 오름차순 또는 내림차순으로 정렬하는 알고리즘
        BubbleSort03 bs = new BubbleSort03();
        int[] result = bs.sorting(arr);
        System.out.println(Arrays.toString(result));

    }
}