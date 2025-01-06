import java.util.*;
public class ArrayList_vs_LinkedList {//to demonstrate the time in LL vs AL
    public static void main(String[] ar){
        long start;//to store the start time in nanoseconds
        long end;//to store the end time
        long diff;//to store end time-start time
        LinkedList<Integer>ll=new LinkedList<Integer>();
        ArrayList<Integer>al=new ArrayList<Integer>();
        /**
         *              LINKED LIST
         */
        start=System.nanoTime();
        for(int i=1;i<=1000000;i++){//inserting
            ll.add(i);
        }
        end=System.nanoTime();
        diff=end-start;
        System.out.println("Time taken by Linked List to fill 1mil elements(1-1000000): "+diff+"ns");
        /**
         *              ARRAY LIST
         */
        start=System.nanoTime();

        for(int i=1;i<=1000000;i++){
            al.add(i);
        }
        end=System.nanoTime();
        diff=end-start;
        System.out.println("Time taken by Array List to fill 1mil elements(1-1000000):  "+diff+"ns");
    }
}
