import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class average {
    public static void main(String args[]){
        int avg,a,b,c,d,e;
        System.out.println("Enter 5 subjects marks: ");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        d= sc.nextInt();
        e= sc.nextInt();
        avg=(a+b+c+d+e)/5;
        System.out.println("Average Marks is: "+avg);
    }
}
