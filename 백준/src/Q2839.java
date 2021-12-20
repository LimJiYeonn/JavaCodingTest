import java.util.Scanner;
public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        
        cnt = n / 5;
        n %= 5;
        if(n % 3 == 0){
            cnt += n / 3;
            System.out.println(cnt);
        }else{
            System.out.println(-1);
        }
    }
}
