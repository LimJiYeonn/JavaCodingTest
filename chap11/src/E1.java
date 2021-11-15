import java.util.*;

public class E1 {
    public static int n;
    public static int k;
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i = 0; i < n; i++){
            arrayList.add(sc.nextInt());
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arrayList.get(i) != arrayList.get(j)) result++;
            }
        }
        System.out.println(result);

    }
}
