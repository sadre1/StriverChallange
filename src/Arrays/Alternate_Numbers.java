package Arrays;

import java.util.Stack;

public class Alternate_Numbers {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int ans [] = new int [a.length];
        Stack<Integer> pos = new Stack<>();
        Stack<Integer> neg = new Stack<>();
        for(int i=a.length-1 ; i>=0 ; i-- ){
            int x =a[i];
            if(x>0)
                pos.push(x);
            else
                neg.push(x);
        }
        for(int i=0 ; i<a.length;i++){
            if(i%2==0){
                a[i]=pos.pop();
            }
            else{
                a[i]=neg.pop();
            }
        }
        return a;

    }
}
