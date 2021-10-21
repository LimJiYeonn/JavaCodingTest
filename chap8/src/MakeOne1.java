import java.util.*;

public class MakeOne1 {
    public static int result = 0;
    public static int make(int x){
        while(x >= 5 ){
            result += x % 5;
            x /= 5;
            result++;
        }while(x >= 3 ){
            result += x % 3;
            x /= 3;
            result++;
        }while(x >= 2){
            result += x % 2;
            x /= 2;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(make(x));
    }
}
