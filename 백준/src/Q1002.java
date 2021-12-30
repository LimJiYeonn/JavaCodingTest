import java.util.Scanner;
public class Q1002 { //터렛
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(teret(x1, y1, r1, x2, y2, r2));

        }
    }
    public static int teret(int x1, int y1, int r1, int x2, int y2, int r2){
        int distance = (int)(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));

        if(x1 == x2 && y1 == y2 && r1 == r2) return -1;
        else if( Math.pow(r1+r2,2) == distance || Math.pow(r1-r2,2) == distance) return 1;
        else if(Math.pow(r1-r2,2) > distance || Math.pow(r1+r2,2) < distance ) return 0;
        else return 2;


    }
}
