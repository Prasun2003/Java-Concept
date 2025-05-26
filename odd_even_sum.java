import java.util.Scanner;
public class odd_even_sum{
    public static void main(String args[]){
        int i,n,sum=0;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0) {
            for (i = 0; i <= n; i=i+2) {
                sum = sum + i;
            }
            System.out.println("even Sum: "+ sum);
        }
        else{
            for (i = 1; i <= n; i=i+2) {
                sum = sum + i;
            }
            System.out.println("Odd Sum: "+ sum);
        }
    }
}
