import java.nio.charset.StandardCharsets;
import java.util.*;
public class Q1157 {
    public static void main(String[] args) {
        int[] cnt = new int[26]; //알파벳 개수 = 26
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.toUpperCase();

        //A = 65, a = 97
        for(int i = 0 ; i < word.length(); i++){
            char c = word.charAt(i);
            cnt[(int)c - 65]++;

//            byte[] bytes = word.getBytes(StandardCharsets.US_ASCII);
//            cnt[bytes[i] - 65]++;
        }

        int big = -1;
        int index = -1;
        for(int j = 0 ; j < 26; j++){
            if(cnt[j] > big){
                big = cnt[j];
                index = j;
            }
        }

        Arrays.sort(cnt);

        if(cnt[0] != 0 && cnt[0] == cnt[1]) System.out.println("?");
        else System.out.println((char)(index+65));

    }
}
