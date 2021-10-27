import java.util.*;
public class TopologySort2 {
    public static int v, e;
    public static int[] indegree = new int[100001];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void topology(){
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= v; i++){
            if(indegree[i] == 0) q.offer(i);
        }

        while(!q.isEmpty()){
            int now = q.poll();
            result.add(now); ////결과에 노드 추가
            for(int i = 0; i < graph.get(now).size(); i++){
                indegree[graph.get(now).get(i)]--;
                if(indegree[graph.get(now).get(i)] == 0)
                    q.offer(graph.get(now).get(i));
            }
        }

        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();

        for(int i = 0; i <= v; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 1; i <= e; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            indegree[b]++;
        }

        topology();
    }
}
