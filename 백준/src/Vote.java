import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Vote {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String name[] = new String[n];
        int score[][] = new int[1000][n];
        String scoreAll;
        int cnt = 0; //반복 횟수


        for(int i = 0; i < n; i++){
            name[i] = br.readLine();
        }

        
        while( (scoreAll = br.readLine()) != null){ //데이터가 빌 때까지 -> 입력값 맨날 달라질 예정
            st = new StringTokenizer(scoreAll," ");
            for(int i = 0; i < n; i++){
                score[cnt][i] = Integer.parseInt(st.nextToken());
            }
            cnt++;
        }

        for(int i = 0; i < cnt; i++){
            for(int j = 0; j < n; j++){
                System.out.print(score[i][j]);
            }
            System.out.println();
        }

        br.close();

/*

        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String name[] = new String[n];
            int score[][] = new int[1000][n];
            String scoreAll;
            int cnt = 0; //반복 횟수

            for(int i = 0; i < n; i++){
                name[i] = br.readLine();
            }


            StringTokenizer st;
            while( (scoreAll = br.readLine()) != null){
                st = new StringTokenizer(scoreAll," ");
                for(int i = 0; i < n; i++){
                    score[cnt][i] = Integer.parseInt(st.nextToken());
                }
                cnt++;
            }

            for(int i = 0; i < cnt; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(score[i][j]);
                }
                System.out.println();
            }



            br.close();


        }catch (Exception e){
            System.out.println("오류");
        }


*/



        /*
        while(!sc.hasNext("\n")){
            for(int i = 0; i < n; i++){
                score[i] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(score[i]);
        }

*/



        /*


          Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String name[] = new String[n];
        int score[] = new int[n];

        for(int i = 0; i < n; i++){
            name[i] = sc.nextLine();
        }

        while(sc.hasNextLine()){
            String temp = sc.nextLine();
            for(int i = 0; i < n; i++){
                score[i] = Integer.parseInt(temp.split(" "));
                score[i] = temp.charAt(i) - '0';
                System.out.println(i+"번째 값"+score[i]);
            }
        }



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String name[] = new String[n];

        for(int i = 0; i < n; i++){
            br = new BufferedReader(new InputStreamReader(System.in));
            name[i] = br.readLine();
        }
*/



    }
}
