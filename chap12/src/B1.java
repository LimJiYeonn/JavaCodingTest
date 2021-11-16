import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class B1 {
    public static String str;
    public static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            str = sc.next();
            int num = Integer.parseInt(str.replaceAll("[a-z|A-Z]]", ""));
            System.out.println(num); //왜 0만 나올까.......호호호호호
        }catch (Exception e){
        }
//        IntStream stream = str.chars();
//        result = stream.filter((ch)-> (48 <= ch && ch <= 57))
//                .mapToObj(ch -> (int)ch)
//                .map(Object::toString)
//                .collect(Collectors.joining())
//                .sum();
        System.out.println(result);



    }
}
