package D_1005;

import java.util.*;
class Calculator3{
    private int num1;
    private int num2;
    public Calculator3(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int plus(){
        return num1 + num2;
    }
    public int minus(){
        return num1 - num2;
    }
    public int multiple(){
        return num1 * num2;
    }
    public float divide(){
        return (float)num1 / num2;
    }

}
// constructor add, parameter del
public class CalculMemberThis {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        Calculator3 cal = new Calculator3(N1, N2);
        System.out.printf("%d\n", cal.plus());
        System.out.printf("%d\n", cal.minus());
        System.out.printf("%d\n", cal.multiple());
        System.out.printf("%f", cal.divide());
    }
}