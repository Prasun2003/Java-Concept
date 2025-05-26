import java.util.Scanner;
class condition {
    public static void main(String args[]) {
        int a;
        System.out.println("enter your age: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if (a > 18) {
            System.out.println("you can");
        } else if (a == 18) {
            System.out.println("you can");
        }
        else{
            System.out.println("you can't");
        }
    }
}
