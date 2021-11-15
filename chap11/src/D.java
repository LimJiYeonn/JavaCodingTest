import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D {
    public static int n;
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++ ){
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);

        int target = 1; //이 target 금액을 만들 수 있는지
        for(int i = 0; i < n; i++){
            if(target < arrayList.get(i)) break; //만들 수 없는 금액 찾으면 반복 종료료
           target += arrayList.get(i);
        }
        System.out.println(target);
    }
}
