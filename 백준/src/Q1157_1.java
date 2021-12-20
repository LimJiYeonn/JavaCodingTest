import java.util.*;
public class Q1157_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.toUpperCase();
        char[] word2 = new char[word.length()];

        for(int i = 0 ; i < word.length(); i++) {
            word2[i] = word.charAt(i);
        }
        Arrays.sort(word2); //문자 나눈다음 정렬
        int cnt = 0; 
        int result = 0;
        char c = 'a';
        boolean same = false;
        for(int i = 0 ; i < word.length(); i++) {
            if(word2[i] == word2[i+1]) { //연속되는 문자면 cnt++
                cnt++;

            }
            else {
                c = word2[i];
                if(cnt > result){
                    result = cnt;
                    same = false;
                }
                else if(cnt == result){
                    same = true;
                }
                cnt = 0;
            }

        }

        if(same) System.out.println("?");
        else System.out.println(c);



    }
}
