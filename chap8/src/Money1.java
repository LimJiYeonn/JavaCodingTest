import java.util.*;
public class Money1 {
    //내가 구현
    public static int[] arr = new int[101]; //화폐가치
    public static int[] d = new int[10001]; //M원
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 1; j <= m; j++){
            d[j] = 10001;
        }

       d[0] = 0;

        for(int i = 0; i < n; i++){
            for(int j = arr[i]; j <= m; j++){
                //j = arr[i] -> j가 arr[i]보다 더 커야 나눌 수 있다.
                if(j % arr[i] == 0) d[j] = j/arr[i];
                d[j] = Math.min(d[j], d[j-arr[i]] + 1);
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
