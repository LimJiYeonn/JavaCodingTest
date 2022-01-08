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
        int[] sorted = new int[n];	// 정렬 할 배열
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// rank를 매길 HashMap

        //입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);

        // 정렬된 배열을 순회하면서 map에 넣어준다.
        int rank = 0;
        for(int v : sorted) {
            /*
             *  이 때 만약 앞선 원소가 이미 순위가 매겨졌다면
             *  중복되면 안되므로, 원소가 중복되지 않을 때만
             *  map에 원소와 그에 대응되는 순위를 넣어준다.
             */
            if(!rankingMap.containsKey(v)) {
                rankingMap.put(v, rank);
                rank++;		// map에 넣고나면 다음 순위를 가리킬 수 있도록 1을 더해준다.
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin) {
            int ranking = rankingMap.get(key);	// 원본 배열 원소(key)에 대한 순위(value)를 갖고온다.
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);



    }
}
