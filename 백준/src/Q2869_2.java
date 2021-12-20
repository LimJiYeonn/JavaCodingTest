import java.util.Scanner;
public class Q2869_2 {
    public static void main(String[] args) { //시간초과
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        //먼저 저녁에 내려오는 만큼을 전체 길이에서 빼기
        int day = (v - b) / (a - b);

        //남은 길이가 있을 경우
        if((v - b) % (a - b) != 0) day++;

        System.out.println(day);

    }
}
