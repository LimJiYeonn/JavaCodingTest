import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSDemo {
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    //bfs
    public static void bfs(int x){
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);//삽입
        visited[x] = true;
        while(!q.isEmpty()){//큐가 빌 때 까지 반복
            //큐에서 하나의 원소를 뽑아(제거해) 출력
            int node = q.poll();
            System.out.println(node + " ");
            //해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for(int i = 0; i < graph.get(node).size(); i++){
                int y = graph.get(node).get(i);
                if(!visited[y]){
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }

    /*public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            System.out.println(node + " ");
            for (int i = 0 ; i < graph.get(node).size(); i++){
                int y = graph.get(node).get(i);
                if(!visited[y]){
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }*/


    public static void main(String[] args) {
        for(int i = 0; i < 9; i++){
            graph.add(new ArrayList<Integer>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);


        bfs(1);
    }
}
