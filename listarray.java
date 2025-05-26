import java.util.*;
public class listarray {
    public static void main(String args[]){
        List<Integer>arraylist=new ArrayList<Integer>();
        for(int i=0;i<=5;i++)
            arraylist.add(i);
            System.out.println(arraylist);
        arraylist.remove(3);
        System.out.println(arraylist);
        for(int i=0;i<arraylist.size();i++)
        System.out.println(arraylist.get(i));

    }
}
