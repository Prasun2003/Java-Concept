abstract class animal{
    public abstract void sound();
}
class dog extends animal{
   public void sound(){
   System.out.println("Barking");
}
}
class lion extends animal{
   public void sound(){
   System.out.println("Roar");
}
}
class Demo{
   public static void main(String[] args) {
       dog r = new dog();
       lion r2 = new lion();
       r.sound(); r2.sound();
   }
}
