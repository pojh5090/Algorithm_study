import java.util.Scanner;

public class basic_triangle {
    public static void main(String[] args) {

        // 1. 정삼각형
        // Scanner sc = new Scanner(System.in);
        // System.out.print("몇줄을 찍을까요? : " );
        // int line = sc.nextInt();

        // for(int i = 0; i < line; i++) {
        //     for(int j = 1; j < line-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int k = 0; k < i*2+1; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 2. 모래시계형 별찍기
        for(int i = 0; i < 3; i++) {
            for(int k = 0; k < i ; k++) {
                System.out.print(" ");
            }
            for(int j = 5; j >= 2*i + 1; j--) {
                System.out.print("*");
            }            
            System.out.println();
        }
        for(int i = 0; i < 3; i++) {
            for(int k = 1; k <= 2-i ; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}