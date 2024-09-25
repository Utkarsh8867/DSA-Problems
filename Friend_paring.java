public class Friend_paring {
    
    // Given n friends each one can remain single or can be paired up with some other freiend .
    // Each friend can be paired only once.Find out the total number of 
    // ways in which friends remain singlE or can be paried up
    
    public static int friendPairing(int n){
        if(n ==1 || n==2){
            return n;
        }

        // int fnm1 = friendPairing(n-1);

        // int fnm2 =friendPairing(n-2);
        // int pairWays = (n-1) * fnm2;


        // int totWays = fnm1 +pairWays;
        // return totWays;
        return friendPairing(n-1) + (n-1) * friendPairing(n-2);

    }
    public static void main(String[] args) {
       System.out.println(friendPairing(4));

    }
} 
