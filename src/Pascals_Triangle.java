import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public List<Long> rows(int numberRows){
        List<Long> row = new ArrayList<>();
        row.add(1L);
        long s=1;
        for(int col=1;col<numberRows;col++){
            s*=(numberRows-col);
            s/=col;
            row.add(s);
        }

        return row;
    }

    public List<List<Long>> pascalsTriang(int numberRows){
        List<List<Long>> pst = new ArrayList<>();
        for(int i=1;i<=numberRows;i++){
            pst.add(rows(i));
        }
        return pst;

    }
}
