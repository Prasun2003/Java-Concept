import java.util.Scanner;
public class add {
    public static void main(String args[]){
        int a,b,c;
        System.out.println("eneter two numbers: ");
        Scanner sc=new Scanner(System.in);
        b=sc.nextInt();
        c=sc.nextInt();
        a=b+c;
        System.out.println("sum is: "+a);
    }
}