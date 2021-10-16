import java.util.*;
public class UpDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] num = new Integer[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        /*
        Arrays.sort(num);
        for(int i = n-1; i >= 0; i--){
            System.out.print(num[i] + " ");
        }
        */
        Arrays.sort(num, Collections.reverseOrder()); //reverse는 stream형태
        for(int i = 0; i <n; i++){
            System.out.print(num[i] + " ");
        }
    }
}
