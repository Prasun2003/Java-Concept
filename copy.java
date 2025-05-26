import java.util.Scanner;
class c {
    int a; String b;
    c(){
        a=10;
        b="Prasun";
        System.out.println(a+" "+b);
    }
    c(c ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
    public static void main(String args[]){
        c r= new c();
        c r2= new c(r);

    }
}
