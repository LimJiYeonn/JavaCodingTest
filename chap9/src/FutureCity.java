import java.util.*;
public class FutureCity {
    public static final int INF = (int) 1e9; // 무한 = 10억
    public static int n, m, x, k; // 노드의 개수(N), 간선의 개수(M) 노드의 개수는 최대 500개라고 가정
    public static int[][] graph = new int[101][101]; // 최단거리 테이블

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();


        // 무한으로 초기화
        for (int i = 0; i < 101; i++) {
            Arrays.fill(graph[i], INF);
        }

        // 자기 자신 0으로 초기화
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                if (a == b) graph[a][b] = 0;
            }
        }

        // 입력
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1; //양방향 이동 가능
        }

        x = sc.nextInt(); //마지막 목표 x
        k= sc.nextInt(); //중간 목표 k

        // 플로이드 워셜
        for (int k = 1; k <= n; k++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        // 출력
        int distance = graph[1][k] + graph[k][x];
        if (distance >= INF) System.out.println(-1);
        else System.out.println(distance);

    }
}
