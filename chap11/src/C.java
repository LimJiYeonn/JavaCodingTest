import java.util.Scanner;

public class C {

    public static String str;
    public static int count0 = 0; //전부 0으로 바꾸는 경우
    public static int count1 = 0; //전부 1로 바꾸는 경우

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        //첫번째 원소에 대해
        if(str.charAt(0) == '1') count0++;
        else count1++;

        //두번째 원소부터 모두 확인
        for(int i = 0; i < str.length() -1; i++){
            if(str.charAt(i) != str.charAt(i+1)){ //바뀌는 지점만 확인인
                if(str.charAt(i+1) == '1') count0++; //다음 수에서 1로 바뀌는 경우
                else count1++; //다음 수에서 0으로 바뀌는 경우
            }
        }
        System.out.println(Math.min(count0, count1));

    }
}
