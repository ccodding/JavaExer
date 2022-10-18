package D_1018;

import java.util.Scanner;

public class RectangleStar02 {
    public void makeRec2(int x, int y){
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        RectangleStar02 rs02 = new RectangleStar02();
        rs02.makeRec2(num, num2);

    }
}
