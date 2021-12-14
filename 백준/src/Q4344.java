import java.util.Scanner;

public class Q4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n번씩 퍼센트 출력

        for(int i = 0; i < n; i++){
            int m = sc.nextInt(); // 학생 점수 개수
            int[] num = new int[m];

            // 각 평균 구하기
            int mean = 0;
            for(int j = 0; j < m; j++){
                num[j] = sc.nextInt();
                mean += num[j];
            }
            mean = mean / m;

            // 평균보다 큰 수의 개수
            int score=0;
            for(int k = 0; k < m; k++){
                if(num[k] > mean) score++;
            }

            // 퍼센트 계산
            double persent =  100.0 * score / m ;
            System.out.println( String.format("%.3f", persent)+"%");
        }
    }
}