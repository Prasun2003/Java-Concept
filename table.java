import java.util.Scanner;
class t{
    public static void main(String args[]){
        int n;
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }

    }
}
