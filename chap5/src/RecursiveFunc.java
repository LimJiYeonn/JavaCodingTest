public class RecursiveFunc {
    public static void main(String[] args) {
        recursiveFunction(1);
    }

    public static void recursiveFunction(int i){
        if(i == 10) return;
        System.out.println("재귀함수를 호출합니다. ");
        recursiveFunction(i+1);
        System.out.println(i + "번째 재귀함수를 종료합니다.");
    }
}
