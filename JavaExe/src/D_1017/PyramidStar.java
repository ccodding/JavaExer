package D_1017;

import java.util.Scanner;

public class PyramidStar {
    public void CntPyra(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PyramidStar py = new PyramidStar();
        py.CntPyra(N);
    }
}
