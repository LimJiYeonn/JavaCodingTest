import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
//나이순 정렬, 좌표 압축
class Member implements Comparable{ //java 226p 보기

    int age;
    String name;

    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return this.age - ((Member)o).age;
    }
}


public class Q10814 {
    public static void main(String[] args) throws IOException {
        ArrayList<Member> list = new ArrayList<>(); //전체를 넣을 리스트
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력받을 버퍼리더
        int n = Integer.parseInt(br.readLine());
        int age = 0;
        String name = "";

        //입력
        StringTokenizer st;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            age = Integer.parseInt(st.nextToken());
            name = st.nextToken();
            list.add(new Member(age, name));
        }

        Collections.sort(list);

        for(int i = 0; i < n; i++){
            System.out.println(list.get(i).age + " " + list.get(i).name);
        }

    }
}
