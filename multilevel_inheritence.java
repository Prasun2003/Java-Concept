class A {
    int a,b,c;
    void add(){
        a=5; b=10;
        c=a+b;
        System.out.println("Sum is: "+c);
    }
    
}
class B extends A{
void sub(){
    a=10; b=5;
    c=a-b;
    System.out.println("Sub is: "+c);
}
}
class C extends B{
void mul(){
    a=5; b=10;
    c=a*b;
    System.out.println("Mul is: "+c);
}
}
class test{
    public static void main(String args[]){
        C a=new C();
        a.add();
        a.sub();
        a.mul();
    }
}