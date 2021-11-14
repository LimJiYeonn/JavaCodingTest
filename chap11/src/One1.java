import java.util.*;
public class One1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] people = new int[n];

        for(int i = 0; i < n; i++){
            people[i] = sc.nextInt();
        }

        Arrays.sort(people); //오름차순 정렬

        //제일 마지막(큰) 원소를 맨 앞부터 하나씩 팀 결성
        int now = 0, end = n, result = 0; //now 팀으로 결성된 모험가, end 팀에서 공포도 최대
        while(now < end) {
            int x = people[end-1] -1; //공포도-1 만큼 팀원을 구해야 함
            now += x; //x명 만큼 팀으로 결성
            result++; //팀 결성
            end--; //다음 팀원 준비
        }
        System.out.println("결과는 : "+result);
    }

}
