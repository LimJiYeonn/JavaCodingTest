import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949 { //균형잡힌 세상

    public static void world(String text){
        String[] arr_text = text.split("");
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < arr_text.length; i++){
            if(arr_text[i].contains("(") ){
                stack.push("(");
                continue;
            }else if(arr_text[i].contains("[")){
                stack.push("[");
                continue;
            }else if(!stack.isEmpty() && arr_text[i].contains(")") && stack.peek() == "(") {
                stack.pop();
                continue;
            }else if(!stack.isEmpty() && arr_text[i].contains("]") && stack.peek() == "[") {
                stack.pop();
                continue;
            }
        }

        if(stack.isEmpty()) System.out.println("yes");
        else System.out.println("no");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text;

        while(true){
            text = br.readLine();
            if(text.equals(".")) break;
            world(text);
        }
    }
}
