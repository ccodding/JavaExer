package D_1005;
import java.util.*;
class Calculator4{
    public int plus(int num1, int num2){
        return num1 + num2;
    }
    public int minus(int num1, int num2){
        return num1 - num2;
    }
    public int multiple(int num1, int num2){
        return num1 * num2;
    }
    public int divide(int num1, int num2){
        return num1 / num2;
    }

}

public class CalculatorMainNo1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        Calculator4 cal = new Calculator4();
        System.out.printf("%d\n", cal.plus(N1, N2));
        System.out.printf("%d\n", cal.minus(N1, N2));
        System.out.printf("%d\n", cal.multiple(N1, N2));
        System.out.printf("%d", cal.divide(N1, N2));
    }
}