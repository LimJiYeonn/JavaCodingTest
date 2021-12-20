import java.util.*;
public class Q1157 { //단어 공부
    public static void main(String[] args) {
        int[] arr = new int[26]; //알파벳 개수 = 26
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.toUpperCase(); //대문자로 변경

        //A = 65, a = 97
        for(int i = 0 ; i < word.length(); i++){
            char c = word.charAt(i);
            arr[c - 'A']++;
        }

        int max = -1;
        char ch = '?';

        for(int i = 0; i < 26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i+65);
            }
            else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
