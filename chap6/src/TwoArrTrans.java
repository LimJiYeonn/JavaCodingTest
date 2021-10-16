import java.util.*;
public class TwoArrTrans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        Integer[] b = new Integer[n];


        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for(int i = 0; i < k; i++){
            if(a[i] < b[i]){// A의 원소가 B의 원소보다 작은 경우 (빠트리지 않기)
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            else break; // A의 원소가 B의 원소보다 크거나 같을 때, 반복문을 탈출 (빠트리지 않기)
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
        }
        System.out.println(sum);

    }
}
