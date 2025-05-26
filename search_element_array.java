import java.util.*;
public class search_element_array {
    public static void main(String args[]){
        int n,count=0;
        int a[]= new int[5];
        System.out.print("Enter 5 elements in an array: ");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("\nArray is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nEnter search element: ");
        n=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                count++;
            }
        }
        if(count>0){
            System.out.println("Item found");
        }
        else{
            System.out.println("item not found");
        }
        
    }
    
}
