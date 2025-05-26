class student {   //super class
    int roll,marks;
    String name;
    void input(){
        System.out.println("Enter your roll,marks & name");
    }
}
class prasun extends student{     //sub class
    void disp(){
        roll=20;
        marks=90;
        name="Prasun Roy";
        System.out.println(roll+" "+marks+" "+name);
    }
    public static void main(String[] args) {
        prasun p= new prasun();
        p.input(); p.disp();
    }
}
