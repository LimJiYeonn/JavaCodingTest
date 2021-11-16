import java.util.Scanner;

public class A1 {
    public static int n, left, right;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String str = Integer.toString(n); //숫자 -> 문자

        for(int i = 0; i < str.length()/2; i++){
            left += str.charAt(i) - '0'; // 왼쪽 부분의 자릿수의 합 더하기
            right += str.charAt(i + str.length()/2) - '0'; // 오른쪽 부분의 자릿수의 합 더하기
        }

        if(left == right) System.out.println("LUCKY");
        else System.out.println("READY");

    }
}
