class shape {
    void draw(){
        System.out.println("cannot say shape type");
    }
}
class square extends shape{
    @Override
    void draw(){
        System.out.println("square");
    }
}
class demo{
    public static void main(String[] args) {
        shape r =new square(); //reference super ka...object hai sub ka
        r.draw(); 
    }
}