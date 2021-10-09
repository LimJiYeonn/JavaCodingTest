import java.util.Scanner;
public class 그리디_1만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        while(n != 1){
            if(n % k == 0) n = n / k;
            else n--;
            count++;
        }

        System.out.println(count);
        //이 문제는 답지보다 내가 더 깔끔하게 푼 듯!! ^ㅎ^
    }
}
