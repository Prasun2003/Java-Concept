import java.util.*;
class ArrayReversal{
    public static void main(String args[]) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an element: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
        System.out.println("Array reversed: ");
        for (int i = a.length-1; i>=0 ; i--) {
            System.out.println(a[i]+" ");
        }
    }
}