package D_1012;

interface Compare{
    boolean doSomething(int valueA, int valueB);
}

public class codeup2081polymorphism {

    // return: maxValue, maxIdx
    private int getMaxOrMin(int[] arr, Compare compare){ // call back

        int targetValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            boolean isSth = compare.doSomething(arr[i], targetValue);
            // max인 경우 arr[i] > targetValue
            // min인 경우 arr[i] < targetValue
            if(isSth){
                targetValue = arr[i];
            }
        }
        return targetValue;
    }

    public int max(int[] arr){
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr){
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {

        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        codeup2081polymorphism codeup2081polymorphism = new codeup2081polymorphism();
        int maxResult = codeup2081polymorphism.max(arr);
        int minResult = codeup2081polymorphism.min(arr);
        System.out.println(maxResult);
        System.out.println(minResult);




    }

}
