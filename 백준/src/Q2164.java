import java.io.*;
import java.util.*;

public class Q2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            queue.add(i);
        }
        while(queue.size() != 1){
            queue.poll();
            if(queue.size() == 1) break;
            int temp = queue.poll();
            queue.add(temp);
        }
        System.out.println(queue.peek());
    }
}
