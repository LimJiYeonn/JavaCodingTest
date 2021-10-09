public class RecursiveFactorial {

    //재귀호출
    public static int recursive(int i){
        if(i <= 1) return 1;
        return i * recursive(i-1);
    }

    //반복호출
    public static int iterative(int n) {
        int result = 1;
        // 1부터 n까지의 수를 차례대로 곱하기
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(recursive(4));
        System.out.println(iterative(4));
    }
}
