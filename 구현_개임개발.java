import java.util.Scanner;
public class 구현_개임개발 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //맵 생성
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][m];
//        System.out.println("n = " + n + "m = " + m);

        //현재위치
        int x=-1, y=-1, dir=-1;
        x = sc.nextInt();
        y = sc.nextInt();
        dir = sc.nextInt();

//        System.out.println("now[0]" + now[0] + "now[1]" + now[1] + "now[2]" + now[2]);

        //멥 구성
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                map[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        int cnt = 4;
        int move = 1;

        while(cnt > 0){
            //방향이 북쪽일 때
            if(dir==0){
                x = x-1;
                if(map[x][y]==0 && x >= 0 && y >= 0 && x < n && y < m){
                    map[x][y] = 1; move++;
                    System.out.println("회전 후 한칸 이동 : 현재 위치는 " + x + y );
                    cnt=4;
                }else{
                    System.out.println("시도한 위치는 " + dir + x + y );
                    x++;
                    cnt--;
                }
                dir=3;
                continue;
            }
            //방향이 동쪽일 때
            else if(dir==1){
                y = y-1;
                if(map[x][y]==0 && x >= 0 && y >= 0 && x < n && y < m){
                    map[x][y] = 1; move++;
                    System.out.println("회전 후 한칸 이동 : 현재 위치는 " + x + y );
                    cnt=4;
                }else{
                    System.out.println("시도한 위치는 " + dir + x + y );
                    y++;
                    cnt--;
                }
                dir--;
                continue;
            }

            //방향이 남쪽
            else if(dir==2){
                x = x+1;
                if(map[x][y]==0 && x >= 0 && y >= 0 && x < n && y < m){
                    map[x][y] = 1; move++;
                    System.out.println("회전 후 한칸 이동 : 현재 위치는 " + x + y );
                    cnt=4;
                }else{
                    System.out.println("시도한 위치는 " + dir + x + y );
                    x--;
                    cnt--;
                }
                dir--;
                continue;
            }

            //방향이 서쪽
            else if(dir==3){
                y = y+1;
                if(map[x][y]==0 && x >= 0 && y >= 0 && x < n && y < m){
                    map[x][y] = 1; move++;
                    System.out.println("회전 후 한칸 이동 : 현재 위치는 " + x + y );
                    cnt=4;
                }else{
//                    System.out.println("서쪽 시행");
                    System.out.println("시도한 위치는 " + dir + x + y );
                    y--;
                    cnt--;
                }
                dir--;
                continue;

            }

        }


        System.out.println("캐릭터가 방문한 칸의 수 = " + move );

        /*
        입력값이
        4 4
        1 1 0
        1 1 1 1
        1 0 0 1
        1 1 0 1
        1 1 1 1
        일 때
        dir=0 -> 3으로 갈때 출력값이 이상하게 나올까....?

         */



    }
}
