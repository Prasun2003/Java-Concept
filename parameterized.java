public class parameterized {
    int x,y;
    parameterized(int a,int b) {
        x=a;
        y=b;
    }
        void show(){
            System.out.println(x+" "+y);
        }
    public static void main(String args[]){
        parameterized p=new parameterized(100,200);
        p.show();
    }
}
