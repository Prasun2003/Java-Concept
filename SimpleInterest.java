import java.util.Scanner;

public class SimpleInterest {
    double principal;
    double rate;
    double time;
    double interest;

    public void calculate() {
        interest = (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SimpleInterest obj = new SimpleInterest();

        System.out.print("Enter the Principal: ");
        obj.principal = input.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        obj.rate = input.nextDouble();

        System.out.print("Enter the Time Period in Years: ");
        obj.time = input.nextDouble();

        obj.calculate();

        System.out.println("Simple Interest: " + obj.interest);

        input.close();
    }
}
