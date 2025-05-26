import java.util.Scanner;

public class Number {
    int num;

    public void checkOddEven() {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Number obj = new Number();

        System.out.print("Enter a number: ");
        obj.num = input.nextInt();

        obj.checkOddEven();

        input.close();
}
}
