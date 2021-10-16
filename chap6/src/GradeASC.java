import java.util.*;

class Grade implements Comparable<Grade>{

    private String name;
    private int score;

    public Grade(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Grade o) {
        if(this.score > o.score)return 1;
        else if(this.score < o.score)return -1;
        return 0;
    }
}

public class GradeASC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Grade> arr = new ArrayList<Grade>();
        for(int i = 0; i < n; i++){
            arr.add(new Grade(sc.next(), sc.nextInt()));
        }

        Collections.sort(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr.get(i).getName() + " ");
        }


    }
}
