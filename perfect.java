//Perfect
//6----> 1 2 3 4 5
//Divisilbe by 6-----> 1+2+3 = 6 It is perfect number
import java.util.Scanner;

public class perfect {
    public static void main(String args[]) {
        int n, i, sum = 0;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.println("perfect no.");
        }
        else{
            System.out.println("not perfect");
        }
    }
}
