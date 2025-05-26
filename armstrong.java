import java.util.Scanner;

public class armstrong {
    public static void main(String args[]) {
        int n,c, r, arm= 0;
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.println("it is armstrong no");
        }
        else{
            System.out.println("It is not ");
        }
    }
}
