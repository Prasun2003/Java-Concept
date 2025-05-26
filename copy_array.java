import java.util.*;
public class copy_array {
    public static void main(String args[]){
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an elements in first array: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("first Array is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("\nSecond Array is: ");
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.print(b[i]+ " ");
        }
    }
}
