import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q17298 { //오큰수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>(); //비교할 스택

        int n = Integer.parseInt(br.readLine());
        int num[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < num.length; i++){
            while(!stack.isEmpty() && num[stack.peek()] < num[i]){ // 엿보기
                num[stack.pop()] = num[i]; // 위에 제거하고 배열 값을 갱신
            }
            stack.push(i); //넣어서 비교
        }

        while(!stack.isEmpty()){
            num[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(num[i]).append(" ");
        }
        System.out.println(sb);

    }
}
