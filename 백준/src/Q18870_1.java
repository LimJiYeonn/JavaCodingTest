import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

public class Q18870_1{ // HaseMap -> 성공 (불필요한 반복문 제거)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] origin = new int[n];	// 원본 배열
        int[] sorted = new int[n];	// 정렬할 배열
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// rank를 매길 HashMap

        //입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);

        int rank = 0;
        for(int v : sorted) {
            if(!rankingMap.containsKey(v)) {
                rankingMap.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin) {
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);

    }
}
