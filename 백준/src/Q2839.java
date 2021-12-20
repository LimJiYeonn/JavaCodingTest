import java.util.Scanner;
public class Q2839 { //tistory 보기
    public static void main(String[] args) { //설탕 배달
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 4 || N == 7) {
            System.out.println(-1);
        }
        else if (N % 5 == 0) {
            System.out.println(N / 5);
        }
        else if (N % 5 == 1 || N % 5 == 3) {
            System.out.println((N / 5) + 1);
        }
        else if (N % 5 == 2 || N % 5 == 4) {
            System.out.println((N / 5) + 2);
        }

        /*
        if (n == 4 || n == 7) {
            System.out.println(-1);
        }else if(n % 5 == 0){
            System.out.println(n/5);
        }
        else if(n <= 12 && n % 3 == 0){
            System.out.println(n/3);
        }else if((n-5) % 3 == 0){
            System.out.println((n-5)/3+1);
        }else if((n-10) % 3 == 0){
            System.out.println((n-10)/3+2);
        }else if((n-15) % 3 == 0){
            System.out.println((n-15)/3+3);
        }

         */
    }
}
