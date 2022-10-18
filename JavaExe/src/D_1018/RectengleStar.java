package D_1018;

import java.util.Scanner;

public class RectengleStar {
    public void makeRectangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        RectengleStar rts = new RectengleStar();
        rts.makeRectangle(num);

    }
}
