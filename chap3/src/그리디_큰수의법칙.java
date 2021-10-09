import java.util.Scanner;
import java.util.Arrays;
public class 그리디_큰수의법칙 {
    public static void main(String[] args) {
        int n, m, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        int[] count = new int[n];
        for(int i = 0; i < n; i++){
            count[i] = sc.nextInt();
        }

        Arrays.sort(count);
        int a =  count[n-1], b =  count[n-2];
        //배열 정렬하는거 틀렸음
//        for(int i = 0; i < n; i++){
//            if(a < count[i]) a = count[i];
//            else if( b < a && b < count[i]) b = count[i];
//        }

        System.out.println("a = " + a + " b = " + b);
        System.out.println("계산 결과 = " +
                ((a * k + b) * (m / ( k + 1) ) + a * ( m - (k+1)*(m/(k+1)) )) );

    }
}
