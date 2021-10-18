import java.util.*;

public class Tteok1 {
    public static int[] Tteok;
    public static int sum = 0;
    public static int m;

    public static int cut(int start, int end){
        int mid = (start + end) / 2;
        if(start > end) return mid;
        if((sum - 4*mid) == m) return mid;
        else if ((sum - 4*mid) > m) return cut(mid+1, end);
        else return cut(start, mid-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Tteok = new int[n];
        int m = sc.nextInt();
        for(int i = 0; i < n; i++){
            Tteok[i] = sc.nextInt();
            sum += Tteok[i];
        }
        Arrays.sort(Tteok);
        System.out.println(cut(0, Tteok[n-1]));

    }
}
