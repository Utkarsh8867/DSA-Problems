
import java.util.Scanner;

public class Arrays {

    public static void updateArray(int markscore[]) {
        for (int i = 0; i < markscore.length; i++) {
            markscore[i] = markscore[i] + 1;
        }
    }

    public static void printArray(int markscore[]) {
        for (int i = 0; i < markscore.length; i++) {
            System.out.print(markscore[i]+ " ");
        }
    }

    public static int LinearSearch(int arr[], int s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                System.out.println("Key found at index " + i);
                return i;
            }
        }
        System.out.println("Key dosent exist in the array");
        return -1;
    }

    public static int Findlargest(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end )/ 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
               start = mid +1;

            }else{
                end = mid -1;
            }
        }

        return -1;
    }

    public static void PairArray( int arr[]){
        int n =arr.length;
        for( int i =0; i<n;i++){
            for( int j=i+1;j<n;j++){
               System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
        int totalpairs=(n*(n-1))/2;

        System.out.println(totalpairs);
    }

    public void reverseArray( int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    public static void SubArrays(int arr[]){
        int samaxsum=Integer.MIN_VALUE;
        int saminsum =Integer.MAX_VALUE;

        for( int i=0;i<arr.length;i++){
            int start =i;
            for( int j=i;j<arr.length;j++){
              int end = j;
              int sum =0;
              for(int k =start;k<end;k++){
                sum +=arr[k];
                System.out.print(arr[k]+ " ");
                
            }
            if(samaxsum < sum){
                samaxsum=sum;
            }
            if(saminsum > sum){
                saminsum =sum;
            }
            sum=0;
              System.out.println();
            }
            // System.out.println();
        }

        System.out.println("Maximum Sub Array Sum is :"+ samaxsum);
        System.out.println("Minimum Sub Array Sum is:"+ saminsum);
    }


    public static void maxSubArraySum(int arr[]){
        int currSum =0;
        int maxSum =Integer.MIN_VALUE;

        int prefix[] =new int[arr.length];

        prefix[0]= arr[0];

        for( int i =1;i<arr.length;i++){
           prefix[i]=prefix[i-1] + arr[i];
        }

        for( int i=0;i<arr.length;i++){
           int  start =i;
          for( int j =i;j<arr.length;j++){
           
            int end =j;

            currSum = start == 0 ? prefix[0] : prefix[end] - prefix[start-1];

            if(maxSum < currSum){
                maxSum = currSum;
            }

          }
        }
        System.out.println("Maximum Sub array Sum is "+ maxSum);
    }

    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        // marks[0] =sc.nextInt();
        // marks[1] = sc.nextInt();
        // System.out.println("mark 1" + marks[0]);
        // System.out.println("mark 2" + marks[1]);

        int markscore[] = {12, 23, 45, 99, 32};

        printArray(markscore);

        // updateArray(markscore);

        // System.out.println("_____________________________________________________________________________");
        // printArray(markscore);

        // System.out.println("_____________________________________________________________________________");

        // LinearSearch(markscore, 33);

        // System.out.println(Findlargest(markscore));

        //         System.out.println("_____________________________________________________________________");


        // Arrays ar = new Arrays();
        
        // System.out.println(BinarySearch(markscore, 99));

        // System.out.println("_____________________________________________________________________");

        // ar.reverseArray(markscore);

        // printArray(markscore);

        // PairArray(markscore);

        // SubArrays(markscore);
        System.out.println();

        maxSubArraySum(markscore);

    }
}
