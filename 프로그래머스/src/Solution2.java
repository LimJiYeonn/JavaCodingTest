import java.util.*;
class Solution2 {
    public static String solution(String new_id) {

        new_id = new_id.toLowerCase().replaceAll("[^a-z,0-9,-,_,.]","")
                .replace("..",".");

        int len = new_id.length();
        char a = new_id.charAt(0), b = new_id.charAt(len-1);


        if(len > 0){
            if( Character.compare(a, '.') == 0){
                new_id = new_id.substring(1);
            }if(Character.compare(b, '.') == 0){
                new_id = new_id.substring(0,len-2);
            }
        }


        len = new_id.length();
        if(len == 0) new_id = "aaa";
        else if(len == 1) new_id = new_id+new_id+new_id;
        else if(len == 2) new_id = new_id + new_id.substring(len-1);
        else if(len > 15) new_id = new_id.substring(0,14);

        String answer = new_id;
        System.out.println(new_id);
        return answer;
    }

    public static void main(String[] args) {
        String a = solution("ab"); //공백을 넣었을 때 오류 발생~^3^

    }
}