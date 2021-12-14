import java.util.Arrays;
import java.util.Scanner;
public class Q10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int big=-1, small=99999;
        for(int i = 0; i < n; i++){
            if(num[i] > big) big = num[i];
            if(num[i] < small) small = num[i];
        }
//        Arrays.sort(num);
        System.out.println(small + " "+ big);
    }
}
