import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Vote_3 {
    public static int n;
    public static int m;
    public static String name[];

    public static void win(int[][] score, int m){
        int big = 0;
        boolean one = false;
        int temp = 0;
        int index = -1;

        for(int i = 0; i < n; i++){ //데이터가 빌 때까지 -> 입력값 맨날 달라질 예정
            temp = 0;
            for(int j = 0; j < m; j++){
                if(score[i][j] == 1){
                    temp++;
                }
            }
            if(big < temp){
                big = temp;
                index = i;
                one = true;
            }else if(big == temp){ //최고로 높지만 같은 표를 받은 후보가 2명 이상일 경우
                big = 10000;
                one = false;
                System.out.println("두 명 이상 당선X");
                //당선 안됐을 경우 를 따로 함수로 만들어 여기에 넣기
            }

        }

        if(big >= 6/2 && one){ //50% 이상이 한명인 경우
            System.out.println( big + "개의 표를 받은 선출 후보 : "+name[index]);
        }else{
            System.out.println("50% 이하 당선X");
            drop(score, m);
            //당선 안됐을 경우 를 따로 함수로 만들어 여기에 넣기
        }

    }

    public static void drop(int[][] score, int m){ //적은 표를 받은 후보 찾기
        int[] temp = new int[n];
        int small = 0;
        boolean[] indexNo = new boolean[n];

        for(int i = 0; i < n; i++){ //데이터가 빌 때까지 -> 입력값 맨날 달라질 예정
            for(int j = 0; j < m; j++){
                temp[i] += score[i][j];
            }
        }
        int[] clone = temp.clone();
        Arrays.sort(clone);
        int big = clone[0];

        //탈락 후보를 true로 변경
        for(int i = 0; i < n; i++){
            if(temp[i] == big){
                indexNo[i] = true;
            }
        }





    }




    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        name = new String[n];

        int score[][] = new int[n][1000];
        String scoreAll = "";
        m = 0; //반복 횟수

        for(int i = 0; i < n; i++){
            name[i] = br.readLine();
        }

        while(true){ //데이터가 빌 때까지 -> 입력값 매번 달라질 예정
            scoreAll = br.readLine();
            if(scoreAll.equals("")){
                break;
            }
            st = new StringTokenizer(scoreAll," ");
            for(int i = 0; i < n; i++){
                score[i][m] = Integer.parseInt(st.nextToken());
            }
            m++;
        }


        for(int k = 0; k < n; k++){
            for(int j = 0; j < m; j++){
                System.out.print(score[k][j]);
            }
            System.out.println();
        }

        br.close();


        win(score, m);



    }
}
