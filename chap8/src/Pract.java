import java.util.*;
public class Pract {
    public static int[] d = new int[101]; //최대 식량
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            d[i] = 10001;
        }

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                d[j] = Math.min(d[j], d[j - arr[i]] + 1);
            }
        }

        // 계산된 결과 출력
        if (d[m] == 10001) { // 최종적으로 M원을 만드는 방법이 없는 경우
            System.out.println(-1);
        }
        else {
            System.out.println(d[m]);
        }


    }

}
