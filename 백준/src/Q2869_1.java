import java.util.Scanner;
public class Q2869_1 { //시간초과
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int day = 0;

        while(v > 0){
            day++;
            v -= a;
            if( v == 0 )break;
            v += b;
        }
        System.out.println(day);
    }
}
