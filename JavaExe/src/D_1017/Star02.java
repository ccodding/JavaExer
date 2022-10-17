package D_1017;

import java.util.Scanner;

public class Star02 {
    public void cntStar(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        Star02 st = new Star02();
        st.cntStar(Num);

    }
}
