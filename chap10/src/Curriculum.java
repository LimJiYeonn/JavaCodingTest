import java.util.*;

public class Curriculum {
    public static int v;
    public static int[] indegree = new int[501];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static int[] times = new int[501];

    public static void topologySort(){ //위상 정렬 함수
        int[] result = new int[501]; //알고리즘 수행 결과를 담을 배열
        for(int i = 0; i <= v; i++){
            result[i] = times[i];
        }
        Queue<Integer> q = new LinkedList<>(); //큐 라이브러리 사용
        for(int i = 1; i <= v; i++){
            if(indegree[i] == 0){//처음 시작할 때는 진입차수가 0인 노드를 큐에 삽입
                q.offer(i);
            }
        }

        while(!q.isEmpty()){//큐 빌 때까지 반복
            int now = q.poll(); //큐에서 원소 꺼내기
            for(int i = 0; i < graph.get(now).size(); i++){ //해당 원소와 연결된 노드들의 진입차수에서 1빼기
                result[graph.get(now).get(i)] = Math.max(result[graph.get(now).get(i)],
                        result[now] + times[graph.get(now).get(i)]);
                indegree[graph.get(now).get(i)]--;
                if(indegree[graph.get(now).get(i)] == 0) //새롭게 진입차수가 0이 되는 노드를 큐에 삽입
                    q.offer(graph.get(now).get(i));
            }
        }

        for(int i = 1; i <= v; i++)//결과 출력
            System.out.println(result[i]);
    }


    public static void main(String[] args) { //위상정렬 사용
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();

        for(int i = 0; i <= v; i++){//그래프 초기화
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 1; i <= v; i++){//방향 그래프의 모든 간선 정보 입력받기
            int x = sc.nextInt();
            times[i] = x;
            while(true){//해당 강의를 듣기 위해 먼저 들어야 하는 강의들의 번호 입력
                x = sc.nextInt();
                if(x == -1) break;
                indegree[i]++;
                graph.get(x).add(i);
            }
        }
        topologySort();
    }
}
