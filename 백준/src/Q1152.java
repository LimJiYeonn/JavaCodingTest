import java.util.Scanner;
public class Q1152 { //단어의 개수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] word2 = word.split(" ");

        int cnt = 0;
        for(int i = 0; i < word2.length; i++){
            if(word2[i].isEmpty()) {
                cnt++;
            }
        }

         System.out.println(word2.length - cnt);
    }
}
