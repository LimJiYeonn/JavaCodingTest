import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Vote_2 {



    public static void win( ArrayList<Score> arr){
        int big1 = -1;
        int big2 = -2;
        int temp = -1;
        int index = -1;
        for(int i = 0; i < arr.size(); i++){
            temp = arr.get(i).one;
            if(temp > big1){
                big1 = temp;
                index = i;
            }else if(temp == big1){
                big2 = temp;
            }
        }

        if(big1 != big2 && big1 >= 6/2) {
            System.out.println(arr.get(index).toString());
        }else{
            System.out.println("탈락 후보 찾기");
        }

    }






    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String name[] = new String[n];
        int score[][] = new int[n][1000];
        String scoreAll;
        int cnt = 0;
        int m = 5;

        for(int i = 0; i < n; i++){
            name[i] = br.readLine();
        }



       for(int j = 0; j < m; j++){ //데이터가 빌 때까지 -> 입력값 맨날 달라질 예
            st = new StringTokenizer(br.readLine()," ");
            for(int i = 0; i < n; i++){
                score[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int j = 0; j < n; j++){ //데이터가 빌 때까지 -> 입력값 맨날 달라질 예정
            for(int i = 0; i < m; i++){
                System.out.print(score[j][i]);
            }
            System.out.println();
        }


        //Algo


        int big = 0;
        int small = 0;
        int temp = 0;
        int index = -1;
        int indexNo = -1;
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
            }else if(big == temp){
                big = -1; //최고로 높지만 같은 표를 받은 후보가 2명 이상일 경우
                //당선 안됐을 경우 를 따로 함수로 만들어 여기에 넣기
            }

        }

        if(big > 6/2 && big != temp){
            System.out.println( big + "개의 표를 받은 선출 후보 : "+name[index]);
        }else{ //당선 안됐을 경우
            for(int i = 0; i < n; i++){ //데이터가 빌 때까지 -> 입력값 맨날 달라질 예정
                temp = 0;
                for(int j = 0; j < m; j++){
                    temp += score[i][j];
                }
                if(small < temp){
                    small = temp;
                    indexNo = i;
                }
            }

            System.out.println("제일 적은 표를 받은 후보 : " + name[indexNo]);
        }









    }
}
