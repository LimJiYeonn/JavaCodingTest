import java.util.*;
public class FindComponent1 {
    //이진, 재귀 사용
    public static int n;
    public static int m;
    public static int[] storage;
    public static int[] custom;

    public static int check(int target, int start, int end ){
        if(start > end) return -1;
        int mid = (start + end) / 2;
        if(storage[mid] == target )return target;
        else if (storage[mid] > target )return check(target, start, mid-1);
        else return check(target, mid+1, end);
    }

    public static void main(String[] args) {
        //데이터 입력
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        storage = new int[n];
        for(int i = 0; i < n; i++){
            storage[i] = sc.nextInt();
        }
        m = sc.nextInt();
        custom = new int[m];
        for(int i = 0; i < m; i++){
            custom[i] = sc.nextInt();
        }

        //정렬
        Arrays.sort(storage);

        //비교
        for(int i = 0; i < m; i++){
            int result = 0;
            result = check(custom[i], 0, n);//storage의 n을 입력해야함 m아님
            if(result == custom[i]) System.out.print("yes ");
            else System.out.print("no ");
        }
    }
}
