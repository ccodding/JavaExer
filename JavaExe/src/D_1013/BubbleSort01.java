package D_1013;

public class BubbleSort01 {

    public int[] sorting(int[] arr){
        for(int i = 1; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {7, 2, 3, 9, 28, 11};
        // 오름차순 또는 내림차순으로 정렬하는 알고리즘
        BubbleSort01 bs = new BubbleSort01();
        bs.sorting(arr);

    }
}
