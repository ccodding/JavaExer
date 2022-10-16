package D_1011;

public class Programmers1_answer {
    public int solution(int n){
        String str = String.valueOf(n);
        int result = 0;
        for(int i = 0; i < str.length(); i++){
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return result; // b급 , String > Integer > String
    }

    public int solution2(int n){
        // %연산 이용, 몫과 나머지
        // Currency
        int result = 0;
        //int origin = n; // 공간복잡도 증가, 지우고 solution2 parameter n으로 대체할 시 공간복잡도 하락

        // for문으로 가능한가, 불가능하며 while문으로 해야한다. 중요
        // n나누기 10을 할 때마다 어디다가 저장을 할 것인가, >> origin에 저장

        // i = 0
        System.out.println(n / 10);// 1234 / 10 몫 123
        System.out.println(n % 10);// 나머지 4

        // i = 1
        System.out.println(n / 10);// 123 / 10 몫 12
        System.out.println(n % 10);// 나머지 3

        while(n > 0) {
            result += n % 10; // 나머지를 먼저 구할 것
            n = n / 10;
            System.out.printf("origin:%d result:%d", n, result);
        }
        return 0;
    }

    public static void main(String[] args) {
        // 687 = 6 + 8 + 7 = 21
        Programmers1_answer sol = new Programmers1_answer();
        int result1 = sol.solution2(1234);

        if (result1 == 10){
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.printf("테스트 실패:%d \n", result1);
        }

    }
}
