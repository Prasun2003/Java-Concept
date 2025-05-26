import java.util.*;
public class insert_element_array {
    public static void main(String[] args){
        int size,i,it,l;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array: ");
    size=sc.nextInt();
    int a[]=new int [size+1];
    for(i=0;i<size;i++){
        a[i]=sc.nextInt();
    }
    // System.out.println("Array is: ");
    // for(i=0;i<size;i++){
    //     System.out.println(a[i]+" ");
    // }
    System.out.println("enter array location: ");
    l=sc.nextInt();
    System.out.println("enter new item: ");
    it=sc.nextInt();
    for(i=size;i>l;i--){
        a[i]=a[i-1];
    }
    a[l]=it;
    size++;
    System.out.println("Array is: ");
    for(i=0;i<a.length;i++){
        System.out.println(a[i]+" ");
    }
}
}
