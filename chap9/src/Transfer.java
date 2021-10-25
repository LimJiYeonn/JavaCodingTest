import java.util.*;
class Node3 implements Comparable<Node3> {

    private int index;
    private int distance;

    public Node3(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return this.index;
    }

    public int getDistance() {
        return this.distance;
    }

    // 거리(비용)가 짧은 것이 높은 우선순위를 가지도록 설정
    @Override
    public int compareTo(Node3 other) {
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
}
public class Transfer {
    public static final int INF = (int) 1e9;
    public static int n, m, c;
    public static ArrayList<ArrayList<Node3>> graph = new ArrayList<ArrayList<Node3>>();
    public static int[] d = new int[30001];

    public static void dijkstra(int start) {
        PriorityQueue<Node3> pq = new PriorityQueue<>();
        pq.offer(new Node3(start, 0));
        d[start] = 0;
        while(!pq.isEmpty()) { // 큐가 비어있지 않다면
            Node3 node = pq.poll(); // 가장 최단 거리가 짧은 노드에 대한 정보 꺼내기
            int dist = node.getDistance(); // 현재 노드까지의 비용
            int now = node.getIndex(); // 현재 노드
            if (d[now] < dist) continue;
            // 현재 노드와 연결된 다른 인접한 노드들을 확인
            for (int i = 0; i < graph.get(now).size(); i++) {
                int cost = d[now] + graph.get(now).get(i).getDistance();
                // 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
                if (cost < d[graph.get(now).get(i).getIndex()]) {
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node3(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //도시의 개수
        m = sc.nextInt(); //통로의 개수
        c = sc.nextInt(); //메시지를 보내고자 하는 도시

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Node3>());
        }

        // 모든 간선 정보를 입력받기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // a번 노드에서 b번 노드로 가는 비용이 c라는 의미
            graph.get(a).add(new Node3(b, c));
        }

        // 최단 거리 테이블을 모두 무한으로 초기화
        Arrays.fill(d, INF);

        // 다익스트라 알고리즘을 수행
        dijkstra(c);

        int sum=0, big=-1;
        for (int i = 1; i <= n; i++) {
            if (d[i] != INF) sum++;
            if(big < d[i]) big=d[i];
        }
        System.out.println(sum + " " + big);
    }

}
