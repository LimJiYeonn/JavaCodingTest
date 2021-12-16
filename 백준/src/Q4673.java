public class Q4673 { // 셀프 넘버
    static int solution(int n){
        int sum = n;
        while(true){
            if(n==0) break;
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        boolean[] num = new boolean[10001];
        for(int i = 1; i <= 10000; i++){
            int x = solution(i);
            if(x <= 10000) num[x] = true;
        }

        for(int i = 1; i < 10001; i++){
            if(!num[i]) System.out.println(i);
        }
    }
}
