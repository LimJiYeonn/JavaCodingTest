import java.util.Scanner;
public class Q1065 { // 한수
    static int hanNumber(int n){
        int cnt = 0;
        if(n < 100) {
            cnt = n;
        }else if(n >= 100){
            cnt = 99;
            for(int i = n; i > 99; i--){
                int[] diff = new int[3];
                int c = 0;

                String s = Integer.toString(i); //숫자를 문자로 변경

                for(int j = s.length()-2; j >= 0; j--){
                    //문자를 한자리씩 나눈후 두 자리수 마다의 차이를 diff에 저장(뒤에서 부터 뺌)
                    diff[j] = Integer.parseInt(s.substring(j+1,j+2)) - Integer.parseInt(s.substring(j,j+1));
                }
                for(int j = 0; j < s.length()-2; j++){
                    if(diff[j] == diff[j+1]) c++;
                }
                if(c == s.length()-2) {
                    cnt++;
//                    System.out.println("cnt++ : " + s);
                }
            }

        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(hanNumber(n));
    }
}


