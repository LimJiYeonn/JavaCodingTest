import java.util.Scanner;

public class Two1 {
    public static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] strArray = str.split(""); //공백문자를 지정하여 한 글자마다 자르기
        int[] intArray = new int[strArray.length]; //숫자로 변환해 담을 배열

        for(int i = 0; i < strArray.length; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        result = intArray[0];
        for(int i = 1; i < intArray.length; i++){
            result = Math.max(result + intArray[i], result * intArray[i]);
        }
        System.out.println(result);
    }
}
