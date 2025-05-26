import java.util.*;
public class average_array{
    public static void main(String args[]){
    int sum=0,avg;
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
        for(int i=0;i<a.length;i++){
            sum=a[i]+sum;
        }
        avg=sum/a.length;
        System.out.println("\nAverage is: "+avg);
    }
}
