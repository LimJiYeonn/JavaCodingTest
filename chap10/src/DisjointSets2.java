import java.util.*;
public class DisjointSets2 {
    public static int v, e;
    public static int[] parent = new int[100];

    public static int findP(int a){//부모찾기
        if(a == parent[a]) return a;
        else return findP(parent[a]);
    }

    public static void union(int a, int b){//union 계산
        a = findP(a); /////////루트 노드를 찾아서 비교해야하니까!
        b = findP(b); /////////
        if(a < b) parent[b] = parent[a];
        else  parent[a] = parent[b];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        v = sc.nextInt();
        e = sc.nextInt();

        for(int i = 1; i <= v; i++){
            parent[i] = i;
        }

        for(int i = 1; i <= e; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }

        //각 원소가 속한 집합 출력
        for(int i = 1; i <= v; i++){
            System.out.print(findP(i) + " ");
        }
        System.out.println();

        //부모 테이블 출력
        for(int i = 1; i <= v; i++){
            System.out.print(parent[i] + " ");
        }


    }
}
