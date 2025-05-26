import java.util.Scanner;
public class power {
    public static void main(String[] args){
        int n,p,result=1;
        System.out.println("eneter number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("eneter power: ");
        p=sc.nextInt();
        for(int i=1;i<=p;i++) {
            result=n*result;
        }
        System.out.println(result);
        }
    }

