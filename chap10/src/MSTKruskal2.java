import java.util.*;
class Edge2 implements Comparable<Edge2>{

    private int nodeA;
    private int nodeB;
    private int distance;

    public Edge2(int nodeA, int nodeB, int distance) {
        this.nodeA = nodeA;
        this.nodeB = nodeB;
        this.distance = distance;
    }

    public int getNodeA() {
        return nodeA;
    }

    public int getNodeB() {
        return nodeB;
    }

    public int getDistance() {
        return distance;
    }

    //짧으면 우선순위 높게
    @Override
    public int compareTo(Edge2 o) {
        if(this.distance < o.distance)
            return -1;
        return 1;
    }
}

public class MSTKruskal2 {
    public static int v, e;
    public static int[] parent = new int[100001];
    public static ArrayList<Edge2> edges = new ArrayList<>();
    public static int result = 0;

    // 특정 원소가 속한 집합을 찾기
    public static int findParent(int x) {
       if(x == parent[x]) return x;
       return parent[x] = findParent(parent[x]); //else가 아니라 return
    }

    // 두 원소가 속한 집합을 합치기
    public static void unionParent(int a, int b) {
       a = findParent(a);
       b = findParent(b);
       if(a < b) parent[b] = a; //parent[a]가 아니라 a
       else parent[a] = b; //parent[b]가 아니라 b
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();

        // 부모 테이블상에서, 부모를 자기 자신으로 초기화
        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }

        //간선 추가
        for (int i = 1; i <= e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();
            edges.add(new Edge2(a, b, d));
        }

        Collections.sort(edges);

        for(int i = 0; i < edges.size(); i++ ){
            int a = edges.get(i).getNodeA(); //get(i)!!!!!!!!
            int b = edges.get(i).getNodeB();
            int dis = edges.get(i).getDistance();
            if(findParent(a) != findParent(b)){
                unionParent(a, b);
                result += dis;
            }

        }

        System.out.println("총 비용 : " + result);

    }
}
