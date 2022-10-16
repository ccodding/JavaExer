package D_1005;
import java.util.*;

class Calculator2{
    public int plus(int num1, int num2){
        return num1 + num2;
    }
    public int minus(int num1, int num2){
        return num1 - num2;
    }
    public int multiple(int num1, int num2){
        return num1 * num2;
    }
    public float divide(int num1, int num2){
        return (float)num1 / num2;
    }

}

public class CalculatorMainFloatNo1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        Calculator2 cal = new Calculator2();
        System.out.printf("%d\n", cal.plus(N1, N2));
        System.out.printf("%d\n", cal.minus(N1, N2));
        System.out.printf("%d\n", cal.multiple(N1, N2));
        System.out.printf("%f", cal.divide(N1, N2));
    }
}