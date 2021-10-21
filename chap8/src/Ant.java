import java.util.*;
public class Ant {
    //220p 다시 풀어보기 - 다이나믹 프로그래밍(보텀업) 사용
    public static int[] d = new int[100]; //계산된 결과를 저장하기 위한 DP테이블

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];//식량정보
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);//첫번째와 두번째중 큰거
        for(int i = 2; i < n; i++){
            d[i] = Math.max(d[i-1], d[i-2] + arr[i]);
        }
        System.out.println(d[n-1]);
    }
}
