import java.util.Scanner;
public class 그리디_거스름돈 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int[] coin = {500, 100, 50, 10};
        for(int i = 0; i < 4; i++ ){
            n += (money / coin[i]);
            money %= coin[i];
        }
        System.out.println("거스름돈의 개수는 : " + n);
    }
}
//n번째의 동전이 n+1번째의 동전과 배수관계일때만 최적의 해가 성립
//만약 동전이 {500, 400, 100}일 경우는 성립이 되지 않는자.