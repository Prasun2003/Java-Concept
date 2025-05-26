import java.util.*;
public class smallest_element_array {
    public static void main(String args[]){
        int min;
        int a[]=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter an element of an array: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.print("\nSmallest element: "+min);
    }
}

