import java.util.Scanner;

public class reverse {
    public static void main(String args[]) {
        int n,r;
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0){
            r=n%10;
            System.out.print(r);
            n=n/10;
        }

    }
}
