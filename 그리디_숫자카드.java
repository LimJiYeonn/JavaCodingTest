import java.util.Scanner;

public class 그리디_숫자카드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] card = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                card[i][j] = sc.nextInt();
                //비교해서 작은 수를 맨 앞에
                if(card[i][0] > card[i][j]) card[i][0] = card[i][j];

                //Math.min사용하는 방법
                //int x = sc.nextInt();
                //min_value = Math.min(min_value, x);
            }
            if(card[0][0] < card[i][0]) card[0][0] = card[i][0]; // '가장 작은 수'들 중에서 가장 큰 수 찾기
            //result = Math.max(result, min_value);
        }
        System.out.println(card[0][0]);
    }
}
