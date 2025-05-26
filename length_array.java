import java.util.*;
public class length_array {
    public static void main(String args[]){
        int a[]= new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an elements: ");
        for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
        System.out.println("Array elements: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nArray length: "+a.length);
}
}
