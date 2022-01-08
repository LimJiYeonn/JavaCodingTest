import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q18870 { // Set -> 계속 시간초과...
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        Set<Integer> set = new HashSet<>(); //set은 중복값 저장X

        //입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
           int temp = Integer.parseInt(st.nextToken());
           num[i] = temp;
           set.add(temp);
        }

        Integer[] num_sort = set.toArray(new Integer[0]); //set -> 배열
        Arrays.sort(num_sort);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < num_sort.length; j++){
                if(num[i] == num_sort[j]) {
                    sb.append(j).append(' ');
                    break;
                }
            }
        }
        System.out.println(sb);

    }
}
