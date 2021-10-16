import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Fruit implements Comparable<Fruit>{
    private String name;
    private int score;

    public Fruit(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

//    public int compareTo(Fruit other){
//        if(this.score < other.score) return -1;
//        else if(this.score > other.score) return 1;
//        return 0;
//    }


    @Override
    public int compareTo(Fruit other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}

public class SortKey {

    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<Fruit>();

        fruits.add(new Fruit("바나나", 2));
        fruits.add(new Fruit("사과", 5));
        fruits.add(new Fruit("당근", 3));


        Collections.sort(fruits); //왜 sort 안돼??? 하 참나

        for(int i = 0; i < fruits.size(); i++){
            System.out.println( "(" + fruits.get(i).getName() + " , " + fruits.get(i).getScore() + ")");
        }

    }
}
