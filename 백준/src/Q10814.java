import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.StringTokenizer;

class Member implements Comparable{

    int age;
    String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Object o) {
        Member m = (Member)o;
        if(this.age > m.age) return 1;
        else if(this.age < m.age) return -1;
        else return 0;

        //Collecctions 인터페이스와 compare 추상상메서드 사용시
//       return o2.age - o1.age;
//        if(o1.age > o2.age) return 1;
//        else if(o1.age < o2.age) return -1;
//        else return 0;
    }
}


public class Q10814 {
    public static void main(String[] args) throws IOException {
        ArrayList<Member> list = new ArrayList<>(); //전체를 넣을 리스트
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력받을 버퍼리더
        int n = Integer.parseInt(br.readLine());
        int age = 0;
        String name = "";

        StringTokenizer st;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            age = Integer.parseInt(st.nextToken());
            name = st.nextToken();
            list.add(new Member(age, name));
        }


        for(int i = 0; i < n; i++){
            System.out.println(list.get(i).age + "  " + list.get(i).name);
        }

    }
}
