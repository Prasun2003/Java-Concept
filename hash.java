import java.util.*;
public class hash {
    public static void main(String args[]){
        HashSet<String> s= new HashSet<String>();
        s.add("P");
        s.add("R");
        s.remove("R");
        s.remove("o");
        System.out.println(s);

    }
}
