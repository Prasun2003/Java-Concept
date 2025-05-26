import java.io.*;
public class console_class {
    public static void main(String args[]){
        String str;
        char ch[];
        Console obj=System.console();
        System.out.println("Enter username: ");
        str=obj.readLine();
        System.out.println("Enter password: ");
        ch=obj.readPassword();
        System.out.println(str+"  "+ch);
    }
}
