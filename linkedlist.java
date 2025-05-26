import java.util.*;
public class linkedlist {
    public static void main(String args[]){
        LinkedList<String>link=new LinkedList<String>();
        link.add("A");
        link.add("B");
        link.addLast("P");
        link.addFirst("R");
        link.remove(2);                                          //link.remove("B");
        System.out.println(link);
    }
}
