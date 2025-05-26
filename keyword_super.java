class A {
    int a=10;
    
}
class B extends A{
    int a=5;
    void disp(){
    System.out.println(a);
    System.out.println(super.a);
    }
}
class test{
    public static void main(String[] args) {
        B r =new B();
        r.disp();
    }
}