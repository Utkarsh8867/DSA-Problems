import java.util.Arrays;
import java.util.Comparator;

public class MaxChainLength {
    public static void main(String[] args) {
        int pairs[][] ={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o ->o[1]));
        
        int chainLen =1;
        
    }
}
