import java.util.Scanner;
public class maximum_number {
    public static void main(String[] args){
        int a,b;
        System.out.println("enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater" + a);
        }
        else{
            System.out.println("b is greater" + b);
        }
    }
}
