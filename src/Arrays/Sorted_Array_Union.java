package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Sorted_Array_Union {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        // List<Integer> list = new ArrayList<>();
        TreeSet<Integer> ts = new TreeSet<>();
        for(int x:a){
            ts.add(x);
        }
        for(int x:b){
            ts.add(x);
        }


        return new ArrayList<Integer>(ts);

    }
}
