import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14888 { // 연산자 끼워넣기
    public static int n;
    public static int[] num;
    public static int[] cal = new int[4];;
    public static int max;
    public static int min;

    public static void calcu(int n, int idx){
        if(idx == n){ //계산을 다할 경우
            max = Math.max(max, n);
            min = Math.min(min, n);
            return;
        }

        for(int i = 0; i < 4; i++){
            if(cal[i] > 0){ //연산자 존재하면
                cal[i]--;
                switch (i){
                    case 0: calcu(n + num[idx], idx+1); break;
                    case 1: calcu(n - num[idx], idx+1); break;
                    case 2: calcu(n * num[idx], idx+1); break;
                    case 3: calcu(n / num[idx], idx+1); break;
                }
                cal[i]++; //재귀 종료시
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < 4; i++){
            cal[i] = Integer.parseInt(st.nextToken());
        }

        calcu(num[0], 1);

        System.out.println(max);
        System.out.println(min);
    }
}
