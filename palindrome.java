import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        int n,r,s=0;
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int c=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if (c == s) {
            System.out.println("palindorne number");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}