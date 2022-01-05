import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436 {//영화감독 숌
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1) System.out.println(666);
        else System.out.println(movieName(n));
    }
    static int movieName(int n){
        int num = 666;
        int cnt = 1;
        while(cnt != n){
            num++;
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
        }
        return num;
    }
}
