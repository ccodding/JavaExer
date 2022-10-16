package D_1004;

import java.util.Scanner;
public class EvenOdd1 {

    private String getEvenOdd(int num) {
        if (num % 2 == 0){
            return "짝수";
        }else {
            return "홀수";
        }
    }
    public void printEvenOddStatement(int first, int second) {
        System.out.printf("%s+%s=%s",
                getEvenOdd(first),
                getEvenOdd(second),
                getEvenOdd(first+second));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        EvenOdd1 evenOdd1 = new EvenOdd1();
        evenOdd1.printEvenOddStatement(first, second);
    }
}