import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RecursionBasics {

    //   Print Number from n to 1(Decresing order)

    public static void printDec(int n){
        if( n== 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
//   Print Number from 1 to n(Deacresing order)
    public static void printInc(int n){
       if(n ==1){
        System.out.print(n+" ");
        return;
       }
       printInc(n-1);
       System.out.print(n+" ");
    }
  public static int fact (int n){
    if(n == 0){
        return 1;
    }
    int fnm1 =fact(n-1);
    int fn = n * fact(n-1); 
    return fn;
   
}
//    print sum of first n natural number
public static int calSum(int n){
    if(n==1){
        return 1;
    }
    int Snm1 = calSum(n-1);
    int Sn = n+Snm1;
    return Sn;
}

// Calculate nth term in fabonacci
public static int fib(int n){
    if( n==0 || n==1){
        return n;
    }
    int fnm1 = fib(n-1);
    int fnm2 = fib(n-2);
    int fn = fnm1 + fnm2;
    return fn;
}

// WAF to find the last occurence of an element in an array
  public static int lastOccurence(int arr[],int key,int i){
      
      if(i == arr.length){
          return -1;
          
        }
          int isFound = lastOccurence(arr, key, i+1);
    if(isFound !=-1 && arr[i] == key){
        return 1;
    }
    
    return isFound; 
  }
    // print x^n in O(logn)
    // Remove Duplicate Character in string
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[] ){
        if(idx == str.length()){
            System.out.println(newStr);
            return;

        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newStr, map);
        } else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar),map);
        }
    }

    public static void main(String[] args) {
        int n=25;
        // printDec(n);
        // printInc(n);
        // System.out.println();
        // System.out.println(fact(n));
        // System.out.println();
        // System.out.println(calSum(n));
        System.out.println(fib( n));
        int arr[]={5,5,5,5,5};
        System.out.println(lastOccurence(arr, 5, 4));
        String str ="appnnacollege";
        removeDuplicates(str, 0,new StringBuilder(""),new boolean[26] );
    }
}
