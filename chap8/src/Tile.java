import java.util.*;
public class Tile {
    public static int[] d = new int[1001];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        d[1] = 1;
        d[2] = 3;
        for(int i = 3; i <= n; i++){
            d[i] = (d[i-1] + 2 * d[i-2]) % 796796; //계속 틀림 주의하기!!!
        }
        System.out.println(d[n]);
    }
}
