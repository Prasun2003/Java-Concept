import java.util.*;
 class Employee{
private int empId;
private String empName;
private int empAge;
public Employee(int empId, String empName, int empAge){
    super();
    this.empId=empId;
    this.empName=empName;
    this.empAge=empAge;
}
public void display(){
    System.out.println(empId);
    System.out.println(empName);
    System.out.println(empAge);
}
}

 public class EmpMg{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int empId;
String empName;
int empAge;
Employee emp;
System.out.println("Enter empId");
empId=sc.nextInt();
System.out.println("enter empName");
empName=sc.next();
System.out.println("Enter empAge");
empAge=sc.nextInt();
 emp = new Employee(empId, empName, empAge);
emp.display();

    }
   
 }