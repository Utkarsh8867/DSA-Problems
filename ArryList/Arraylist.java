    //  import java.util.ArrayList;
     import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


 /**
  * ArrayList
         Array                                    ArrayList

 1)    fixes size                              dynamic size
 2)    primitiive data types can be stored     primative data types can't be stored directly

  */
 public class Arraylist {
    public static  void swap( ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,idx2);
        list.set(idx2,temp);
     }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<String> list1 =new ArrayList<>();

        // Add value
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);

       // Get element
       int element =list.get(2);
       System.out.println(element);

       System.out.println(list);

       // remove 
       list.remove(2);
       System.out.println(list);

       // set element at index 

       list.set(2,10);
       System.out.println(list);

       // contains element

       System.out.println(list.contains(1));

    //    add element at specific index

       list.add(1,9);
       System.out.println(list);

       //size of arraylist

     System.out.println(list.size());

     // print the ArrayList 
     for(int i =0;i<list.size();i++){
        System.out.print(list.get(i));

     }
      System.out.print(" ");
 
      //reverse ArrayList

      for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i) +" ");
      }
        System.out.println();

        // find max
        //  int MAX = Math.max(MAX,list.get(i));

        
         int max =Integer.MIN_VALUE; //O(n)
         for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max = list.get(i);
            // }
                // OR
            max = Math.max(max,list.get(i));
         }
         System.out.println("MAX value is "+  max);

        //  Swap 2 Numbers

       
        int idx1 = 1,idx2= 0;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);


        //Collection = interface  || Collections = class 

        Collections.sort(list);
        System.out.println(list);

        //descending   
        // note = Comparator =Collections.reverseOrder()

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        // Multi-Dimentional Arraylist
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(1);list2.add(2);
        mainlist.add(list2);

        ArrayList<Integer> list3 =new ArrayList<>();
        list3.add(3); list3.add(4);
        mainlist.add(list3);

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> CurrList = mainlist.get(i);
            for(int j=0;j<CurrList.size();j++){
                System.out.print(CurrList.get(j)+" ");
            }
            System.out.println();
        }

        System.out.println(mainlist); 









    }
 }