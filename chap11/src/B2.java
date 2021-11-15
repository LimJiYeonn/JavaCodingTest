import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        long result = str.charAt(0) - '0'; //첫번째 문자를 숫자로 변경한 값을 대입

        for(int i = 1; i < str.length(); i++){
            int num = str.charAt(i) - '0';
            if(num <= 1 || result <= 1) result += num;
            else result *= num;
        }
        System.out.println(result);
    }
}
