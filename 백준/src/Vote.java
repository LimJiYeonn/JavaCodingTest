import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Vote {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name[] = new String[n];
        int score[] = new int[n];

        for(int i = 0; i < n; i++){
            name[i] = sc.nextLine();
        }

        for(int i = 0; i < n; i++){

            System.out.println(name[2]);
        }
/*
        while(!sc.hasNext("\n")){
            for(int i = 0; i < n; i++){
                score[i] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(score[i]);
        }

*/



        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String name[] = new String[n];

        for(int i = 0; i < n; i++){
            br = new BufferedReader(new InputStreamReader(System.in));
            name[i] = br.readLine();
        }
*/

    }
}
