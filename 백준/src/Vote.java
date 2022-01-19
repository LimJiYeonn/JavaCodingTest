import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Score{
    String name;
    int one; // 1순위로 뽑힌 수
    int sum; // 합 (높을 수록 낮은 순위)

    public Score(String name) {
        this.name = name;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        /*return "Score{" +
                "name='" + name + '\'' +
                ", one=" + one +
                ", sum=" + sum +
                '}';

         */
        return name;
    }

}

public class Vote {
    public static int n; //후보자 수
    public static int m; //투표한 사람 수
    public static ArrayList<Score> arr = new ArrayList<>(); // 이름과 순위 담음


    //선출된 후보 찾기
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

        if(big1 != big2 && big1 >= m/2.0) {
            //System.out.println(arr.get(index).toString());
            System.out.println("당선된 후보는 " + arr.get(index).toString() + "입니다.");
            return;

        }else{
            System.out.println("탈락 후보 찾기로 이동");
            drop(arr);
        }

    }


    //적은 표를 받은 후보 찾아 삭제시키기
    public static void drop(ArrayList<Score> arr){
        int big = -1;
        int temp = -1;
        boolean[] index = new boolean[n];
        int give = 0;

        //합이 가장 큰 값(적은 표를 받음) 구하기
        for(int i = 0; i < arr.size(); i++){
            temp = arr.get(i).sum;
            if( temp > big){
                big = temp;
            }
        }

        //해당 index를 true로 변환
        for(int i = 0; i < arr.size(); i++){
            if(big == arr.get(i).sum){
                index[i] = true;
            }
        }

        //뒤부터 삭제 (여러개의 리스트 삭제할 때 앞에서 부터 삭제하면 오류남 왜일까)
        for(int i = n-1; i >= 0; i--){
            if(index[i]){
                give += arr.get(i).one;
                System.out.println(arr.get(i).toString() + "가 삭제 되었습니다. ");
                arr.remove(i);
            }
        }

/*
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i).toString());
        }

 */

        if(arr.size() == 0){
            System.out.println("모든 후보자가 동점입니다. ");
            return;
        }

        //탈락된 후보의 점수를 1순위 후보자에게 주기
        int big1Give = -1;
        int tempGive = -1;
        int indexGive = -1;
        for(int i = 0; i < arr.size(); i++){
            tempGive = arr.get(i).one;
            if(tempGive > big1Give){
                big1Give = tempGive;
                indexGive = i;
            }
        }

        arr.get(indexGive).one += give; //표 몰아주기
        win(arr);

    }




    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        m = 0;
        String scoreAll = "";

        int scoreTemp[][] = new int[n][1000]; // 투표 수 임시 저장
        arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(new Score(br.readLine()));
        }

        while(true){ //입력값 매번 달라질 예정
            scoreAll = br.readLine();
            if(scoreAll.equals("")){
                break;
            }
            st = new StringTokenizer(scoreAll," ");
            for(int i = 0; i < n; i++){
                scoreTemp[i][m] = Integer.parseInt(st.nextToken());
            }
            m++;
        }

        // 클래스에 넣기
        int temp=0;
        int one;
        int sum;
        for(int i = 0; i < n; i++){
             one = 0;
             sum = 0;
            for(int j = 0; j < m; j++){
                temp = scoreTemp[i][j];
                sum += temp;
                if( temp == 1) one++;
            }
            arr.get(i).setOne(one);
            arr.get(i).setSum(sum);
        }

        // 실행
        win(arr);

        br.close();

    }
}
