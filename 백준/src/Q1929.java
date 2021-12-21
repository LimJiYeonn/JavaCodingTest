import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 { //성공 2~Math.sqrt(n)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //readLine()시 에러던져줘야함

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i = m; i <= n; i++){
            if(i < 2 ) continue; //0과 1은 소수X
            boolean isPrime = false;
            for(int j = 2; j <= Math.sqrt(i); j++){ //루트n 이하의 수까지 검사
                if(i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if(!isPrime) System.out.println(i);
        }
        br.close();
    }

}
