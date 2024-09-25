import java.util.Arrays;

public class minimum_absolute {
    public static void main(String[] args) {
       int A[] ={5,6,3,4,8};
       int B[] = {5,8,9,3,4};

       Arrays.sort(A);
       Arrays.sort(B);

       int minDiff = 0;

       for(int i=0;i<A.length;i++){
        minDiff += Math.abs(A[i]-B[i]);
       }

       System.out.println("min absolute diff of pairs =" + minDiff);
    }
}
