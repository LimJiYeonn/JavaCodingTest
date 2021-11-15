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

        for(int i = 1; i <= m; i++){
            n -= arr[i];
            result += arr[i];
        }
    }
}
