 class method {
    void add(){
        int a=5,b=10;
        System.out.println(a+b);
    }
     public static void main(String[] args) {
         method m = new method();
         m.disp();
         m.add();
         //method.add();
     }
     void disp() {
         System.out.println("hello Prasun");
     }
 }
