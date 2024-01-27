/*Question Statement : Write a program to increment the salaries of employees according to their designation. Manager – 5000, General Manager – 10000, CEO – 20000, Worker – 2000. Use employee name, designation, and id as data members and increment salary as method. */
import java.util.Scanner;
public class Employee {
  String empDesignation,empName;
  float empSalary;
  int empId;

  //constructors
  public Employee(){
    empDesignation="";
    empSalary=0.0f;
  }
  //methods
  public void getDetails(){
    Scanner empObj = new Scanner(System.in);
    System.out.println("Enter employee name : ");
    empName = empObj.nextLine();
    Scanner desObj = new Scanner(System.in);
    System.out.println("Enter employee designation : ");
    empDesignation= desObj.nextLine();
    Scanner idObj = new Scanner(System.in);
    System.out.println("Enter employee ID : ");
    empId = idObj.nextInt();
    Scanner salObj = new Scanner(System.in);
    System.out.println("Enter employee salary : ");
    empSalary = salObj.nextFloat();
  }
  public void incrementSal(){
    if(this.empDesignation.equals("manager")){
      this.empSalary+=5000;
    }
    else if(this.empDesignation.equals("general manager")){
      this.empSalary+=10000;
    }
    else if(this.empDesignation.equals("ceo")){
      this.empSalary+=20000;
    }
    else if(this.empDesignation.equals("worker")){
      this.empSalary+=2000;
    }
    else{
      System.out.println("Entered designation is invalid. Please make sure that it is one of the following : manager,general manager,worker,ceo");
    }
  }
  public void displayIncrement(){
    System.out.println("Employee details : ");
    System.out.println("Employee Name : "+empName);
    System.out.println("Employee Designation : "+empDesignation);
    System.out.println("Employee ID : "+empId);
    System.out.println("Employee Salary after Increment : "+empSalary);
  }
  public static void main(String[] args){
    Employee e1 = new Employee();
    e1.getDetails();
    e1.incrementSal();
    e1.displayIncrement();
  }
}
