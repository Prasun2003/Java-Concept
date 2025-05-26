class A {
    void disp(){
        System.out.println("enter your name");
    }
}
class B extends A{
void disp1(){
    System.out.println("my name is Prasun");
}
}
class C extends A{
void disp2(){
    System.out.println("my name is roy");
}
}
class test{
    public static void main(String[] args) {
        B r= new B();
        r.disp();
        r.disp1();
        C r2=new C();
        r2.disp();
        r2.disp2();
    }
}