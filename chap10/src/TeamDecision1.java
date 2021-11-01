import java.util.*;
public class TeamDecision1 {
    public static int n;
    public static int m;
    public static int[] parent = new int[100001];

    public static int findParent(int x){
        if(x == parent[x]) return x;
        else return parent[x] = findParent(parent[x]);
    }

    public static void unionParent(int a, int b){
        a = findParent(a);
        b = findParent(b);
        if(a < b) parent[b] = a;
        else parent[a] = b;
    }

    public static void findParentTeam(int a, int b){
        a = findParent(a);
        b = findParent(b);
        if(a==b) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0; i < n; i++){
            parent[i] = i; //자기자신으로 초기화!!!!
        }

        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ( a == 0 ) unionParent(b, c);
            else if( a == 1) findParentTeam(b, c);
        }
    }
}
