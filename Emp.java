/*Question Statement : Create a class Employee. Derive 3 classes from this class namely, Programmer, Analyst & Project Leader. Take attributes and operations on your own. */
import java.util.Scanner;
class Emp {
  String empName;
  int empId;
   Emp(){
    empName = "empty";
    empId =0;
  }
  public void getEmpInfo(){
    Scanner nameObj = new Scanner(System.in);
    System.out.println("Enter employee name : ");
    empName = nameObj.nextLine();
    Scanner idObj = new Scanner(System.in);
    System.out.println("Enter employee ID : ");
    empId = idObj.nextInt();
  }
  public void putEmpInfo(){
    System.out.println("Employee Name :"+empName);
    System.out.println("Employee ID :"+empId);
  }
}
class ProjectLeader extends Emp{
  String empRole = "Project Leader";
  int empBonus;
  ProjectLeader(){
    //constructor of the base class with no argument gets automatically called in the derived class constructor
    empBonus = 0;
  }
  public void setSal(){
    this.getEmpInfo();
    this.putEmpInfo();
    System.out.println("Employee Designation : "+empRole);
    Scanner bonusObj = new Scanner(System.in);
    System.out.println("Enter salary bonus for employee : ");
    empBonus = bonusObj.nextInt();
    System.out.println("Bonus awarded.");
  }
  public static void main(String[] args){
    ProjectLeader p = new ProjectLeader();
    p.setSal();
  }
}
class Programmer extends Emp{
  String empRole = "Programmer";
  int empBonus;
  Programmer(){
    empBonus = 0;
  }
  public void setSal(){
    this.getEmpInfo();
    this.putEmpInfo();
    System.out.println("Employee Designation : "+empRole);
    Scanner bonusObj = new Scanner(System.in);
    System.out.println("Enter salary bonus for employee : ");
    empBonus = bonusObj.nextInt();
    System.out.println("Bonus awarded.");
  }
   public static void main(String[] args){
    Programmer p = new Programmer();
    p.setSal();
  }
}
class Analyst extends Emp{
  String empRole = "Analyst";
  int empBonus;
  Analyst(){
    empBonus = 0;
  }
  public void setSal(){
    this.getEmpInfo();
    this.putEmpInfo();
    System.out.println("Employee Designation : "+empRole);
    Scanner bonusObj = new Scanner(System.in);
    System.out.println("Enter salary bonus for employee : ");
    empBonus = bonusObj.nextInt();
    System.out.println("Bonus awarded.");
  }
  public static void main(String[] args){
    Analyst a = new Analyst();
    a.setSal();
  }
}