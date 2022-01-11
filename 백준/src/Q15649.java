import java.io.*;
import java.util.*;

public class Q15649 {
    public static boolean[] visit; //현재 돌고있는 노드=T, 안돌고 있는 노드=F
    public static int[] arr; //값 담을 배열
    public static StringBuilder sb = new StringBuilder();

    public static void back(int n, int m, int depth){
        if(depth == m){ //m개까지 채웠을 때
            for(int i : arr){
                sb.append(i).append(" ");
            }
            sb.append('\n');
            return;
        }
        for(int i = 0; i < n; i++){
            if(!visit[i]){ //겹치지 않도록
                visit[i] = true;
                arr[depth] = i + 1; //출력할 값 담기
                back(n, m, depth+1);
                visit[i] = false;
            }
        }
        return;
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visit = new boolean[n];
        arr = new int[m];
        back(n,m,0);
        System.out.println(sb);

    }
}
