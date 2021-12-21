import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929_2 { //시간초과
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //readLine()시 에러던져줘야함

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i = m; i <= n; i++){
            int cnt = 0; //소수X 일 때마다 ++
            for(int j = 2; j < i; j++){
                if(i % j == 0)cnt++;
            }
            if(cnt == 0) System.out.println(i);
        }
    }

}
