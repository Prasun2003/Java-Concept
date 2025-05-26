import java.util.Scanner;
public class natural {
    public static void main(String args[]){
        int i,n;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            System.out.println("Natural: "+i);
        }
    }
}
