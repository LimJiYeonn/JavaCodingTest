import java.util.Scanner;
public class Practice { // 한수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] diff = new int[3];
        int cnt = 99;
        int c = 0;

        for(int i = n; n > 99; n--){
            String s = Integer.toString(i);

            for(int j = s.length()-2; j >= 0; j--){
                //문자를 한자리씩 나눈후 두 자리수 마다의 차이를 diff에 저장
                diff[j] = Integer.parseInt(s.substring(j+1,j+2)) - Integer.parseInt(s.substring(j,j+1));
            }
            for(int j = 0; j < s.length()-2; j++){
                if(diff[j] == diff[j+1]) c++;
            }
            if(c == s.length()-2) {cnt++;
                System.out.println(s);}
        }
        System.out.println(cnt);




    }
}

