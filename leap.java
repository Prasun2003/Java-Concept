import java.util.Scanner;
class leap {
    public static void main(String args[]) {
        int n;
        System.out.println("enter any year: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%400==0 && n%100==0 || n%100!=0 && n%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not leap year");
        }

    }
}