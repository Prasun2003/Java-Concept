class constructor {
    int a; String name;
    constructor(){
        a=10;
        name="Prasun";
    }
    void show(){
        System.out.println(a);
        System.out.println(name);
    }
    public static void main(String args[]){
        constructor c=new constructor();
        c.show();
    }
}
