import java.io.*;
import java.util.*;
public class Q1021 { //회전하는 큐 -> 덱으로 구현
    //큐를 구현클래스는 PriorityQueue(우선순위 큐), ArrayDeque(배열 양방향 큐), LinkedList(연결리스트)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //전체 수
        LinkedList<Integer> deque = new LinkedList<>();
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        //뽑을 수
        int[] want = new int[m];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < m; i++) {
            want[i] = Integer.parseInt(st.nextToken());
        }


        //계산
        for(int i = 0; i < m; i++){
            int target_idx = deque.indexOf(want[i]);
            int half_idx;
            if(deque.size() % 2 == 0) half_idx = deque.size() / 2 - 1;
            else half_idx = deque.size() / 2;

            if(target_idx <= half_idx){ //찾는게 앞에 있는 경우 뒤로 보내기
                for(int j = 0; j < target_idx; j++){
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    cnt++;
                }
            }else{ //찾는게 뒤에 있을 경우 앞으로 보내기
                for(int j = 0; j < deque.size() - target_idx; j++){
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    cnt++;
                }
            }
            deque.pollFirst(); //연산 후 맨 앞 삭제
        }
        System.out.println(cnt);
    }
}
