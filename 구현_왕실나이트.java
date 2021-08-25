import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class 구현_왕실나이트 {
    public static void main(String[] args){
        //데이터 입력
        Scanner sc = new Scanner(System.in);
        String now = sc.next();
        char x = now.charAt(0);
        int y = Integer.parseInt(now.replaceAll("[^0-9]", ""));
        int count = 0;
//        System.out.println(x + " + "+ y);

        //이동가능 좌표
        int[] x_move = {-2, -2, 2, 2, -1, 1, 1, -1};
        int[] y_move = {-1, 1, -1, +1, 2, 2, -2, -2};

        //이동
        for(int i = 0; i < 8; i++){
            int x2 = (int)x + x_move[i];
            int y2 = y + y_move[i];
            if(x2 < 97 || x2 > 104 || y2 < 1 || y2 > 8 )continue;
//            System.out.println((char)x2 + " + "+ y2);
            count++;
        }
        System.out.println( (char)x + ""+ y + "가 이동할 수 있는 경우의 수는 : " + count);
    }
}
