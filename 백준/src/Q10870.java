import java.util.Scanner;

public class Q10870 { //피보나치 수 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fivo(n));
    }
    public static int fivo(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return fivo(n-1) + fivo(n-2);
    }
}
