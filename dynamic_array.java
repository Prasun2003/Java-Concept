import java.util.Scanner;
public class dynamic_array {
    public static void main(String args[]){
        int size,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        size=sc.nextInt();
        int a[]=new int[size];
        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Printed array: ");
        for(i=0;i<size;i++){
            System.out.println(a[i]);
        }
    }
}
