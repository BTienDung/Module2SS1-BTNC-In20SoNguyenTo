package season1.IsPrimeLess100;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số lượng cần in: ");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;

        System.out.printf("\nCac so nguyen to la: ");
        while (count<=numbers){
            boolean checkPrime = true;
            for (int i=2;i<=Math.sqrt(N);i++){
                if (N % i == 0){
                    checkPrime = false;
                    break;
                };
            }
            if (checkPrime){
                count++;
                System.out.print(" "+N);
            }
            N++;
        }



    }
}
