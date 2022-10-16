package D_1012;

public class codeup2081 {

    // return: maxValue, maxIdx
    public int[] getMax(int[] arr){

        int maxValue = arr[0];
        int maxIdx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }


    public static void main(String[] args) {
        // arr 선언
        //int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};

        // o표기법 O(N) 9개를 다 봐야함 >> O에 N인 이유 전체를 다 보기 때문
        // Map map = new HashMap();  >> O(1) 키값으로 접근하기 때문
        // loop 구성
        // int maxValue = 0;
        // if(max value(0) < arr[0]{
        // maxValue = arr[i];
        //  }
        // logic에 대한 문제가 있음
        // int max = 0으로 초기화하기 때문에 음수인경우 결과값이 나오지 않음
        // max = arr[0]으로 한다면 음수의 경우에도 해결
        // 또 하나의 개선점 = loop를 0부터 시작
        // 루프를 1부터 시작하면 O(N-1)이 된다 > O표기법으로는 O(N) == O(N-1)

        int[] arr = new int[]{-3, -29, -38, -12, -57, -74, -40, -85, -61};

        codeup2081 max = new codeup2081();
        int[] result = max.getMax(arr);
        if (result[0] == -3 && result[1] == 0) {
            System.out.println("테스트 통과 했습니다.");
        } else{
            System.out.println("테스트 실패입니다. result:" + result);
        }




    }

}
