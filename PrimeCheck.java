import java.util.Scanner;
public class PrimeCheck {
    public static void main(String args[]) {
        int n, i,count=0;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("not Prime");
        }
    }
}
