import java.util.Scanner;
public class DrinkFreeze {
    public static int n, m;
    public static int[][] map = new int[100][100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                map[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }


}
