import java.util.Scanner;
public class even_natural {
    public static void main(String args[]){
        int i,n;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i=i+2){
            System.out.println(i);
        }

    }
}