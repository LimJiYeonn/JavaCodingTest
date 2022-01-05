import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2798 { //블랙잭 (Brute Force)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int num[] = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(blackJack(N, M, num));

    }

    static int blackJack(int N, int M, int[] num){
        int result = 0;
        for(int i = 0; i < N-2; i++){ //숫자 겹치면 안되니까
            for(int j = i+1; j < N-1; j++){
                for(int k = j+1; k < N; k++){
                    int temp = num[i] + num[j] + num[k];
                    if(temp == M)
                        return temp;
                    else if(temp < M && temp > result){
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
