import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949_1 { //균형잡힌 세상

    public static String world(String text){

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < text.length(); i++){
            char temp = text.charAt(i);
            if(temp == '(' || temp == '['){
                stack.push(temp);
            }else if(temp == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return "no";
                }else{
                    stack.pop();
                }
            }else if(temp == ']'){
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                }else{
                    stack.pop();
                }
            }
        }

        if(stack.empty()) return "yes";
        else return "no";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String text;

        while(true){
            text = br.readLine();
            if(text.equals(".")) break;
            sb.append(world(text)).append('\n');
        }
        System.out.println(sb);
    }

}
