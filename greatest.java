import java.util.Scanner;
public class greatest {
    public static void main(String args[]){
        int a,b,c;
        System.out.println("Enter three numbers: ");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is greater");
        } else if (b>c && b>a) {
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is gretaer");
        }

    }
}
