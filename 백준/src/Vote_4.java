import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Vote_4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String name[] = new String[n];
        int score[][] = new int[n][1000];
        String scoreAll;
        int cnt = 0; //반복 횟수


        for (int i = 0; i < n; i++) {
            name[i] = br.readLine();
        }


        while (" " != (scoreAll = br.readLine())) { //데이터가 빌 때까지 -> 입력값 매번 달라질 예정
            st = new StringTokenizer(scoreAll, " ");
            for (int i = 0; i < n; i++) {
                score[i][cnt] = Integer.parseInt(st.nextToken());
            }
            cnt++;
        }


        for (int k = 0; k < n; k++) {
            for (int j = 0; j < cnt; j++) {
                System.out.print(score[k][j]);
            }
            System.out.println();
        }

        br.close();
    }
}
