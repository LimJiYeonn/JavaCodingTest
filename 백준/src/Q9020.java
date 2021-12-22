import java.util.Scanner;

public class Q9020 { // 골드바흐의 추측
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[10000];

        // 소수 = true 로 만들기
        isPrime[1] = false;
        isPrime[2] = true;
        for (int i = 2; i < isPrime.length; i++){
            isPrime[i] = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime[i] = false;
                    break;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            if(isPrime[n/2]) {
                System.out.println(n/2 + " " + n/2);
            }else{
                for(int j = n/2; j > 0; j--){
                    if(isPrime[j] && isPrime[n-j]){
                        System.out.println(j + " " + (n-j));
                        break;
                    }
                }
            }
        }
    }
}
