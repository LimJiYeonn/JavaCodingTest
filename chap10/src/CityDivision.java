import java.util.*;

class Edge3 implements Comparable<Edge3>{

    private int distance; //static 제외해야함!!! 계속 static 붙여서 오류났었다. 
    private int nodeA;
    private int nodeB;

    public Edge3(int distance, int nodeA, int nodeB) {
        this.distance = distance;
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }


    public int getDistance() {
        return distance;
    }

    public int getNodeA() {
        return nodeA;
    }

    public int getNodeB() {
        return nodeB;
    }

    @Override
    public int compareTo(Edge3 o) {
        if(this.distance < o.distance) return -1;
        return 1;

    }
}

public class CityDivision {
    public static int n, m;
    public static int[] parent = new int[100001];
    public static ArrayList<Edge3> edges = new ArrayList<>();
    public static int result = 0;

    public static int findParent(int x){
        if(parent[x] == x) return x;
        return parent[x] = findParent(parent[x]); //return (else 아님X)
    }

    public static void unionParent(int a, int b){
        a = findParent(a);
        b = findParent(b);
        if(a < b) parent[b] = a;
        else parent[a] = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 1; i <= n; i++){//
            parent[i] = i;
        }

        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            edges.add(new Edge3(cost, a, b));
        }

        Collections.sort(edges);
        int last = 0; // 최소 신장 트리에 포함되는 간선 중에서 가장 비용이 큰 간선

        for(int i = 0; i < edges.size(); i++){
            int cost = edges.get(i).getDistance();
            int a = edges.get(i).getNodeA();
            int b = edges.get(i).getNodeB();
            if(findParent(a) != findParent(b)) {
                unionParent(a, b);
                result += cost;
//                System.out.println( i + " 번째의 결과는 " + result);
                //결과가 0번째 결과는 4 나오고 끝.........
                last = cost;
            }
        }

        System.out.println(result - last);
    }
}


/*
입력 데이터:
7 12
1 2 3
1 3 2
3 2 1
2 5 2
3 4 4
7 3 6
5 1 5
1 6 2
6 4 1
6 5 3
4 5 3
6 7 4

출력 데이터:
8
 */
