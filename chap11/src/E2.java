import java.util.*;

public class E2 {
    public static int n, m;
    public static int[] arr = new int[11]; //1~10 무게 담는 배열
    public static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            arr[x] += 1;
        }

        for(int i = 1; i <= m; i++){ // 1부터 m까지의 각 무게에 대하여 처리
            n -= arr[i]; // 무게가 i인 볼링공의 개수(A가 선택할 수 있는 개수) 제외
            result += arr[i] * n; // B가 선택하는 경우의 수와 곱해주기
        }
        System.out.println(result);
    }
}
