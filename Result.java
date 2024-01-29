/* Question Statement : Design three classes: Student, Exam and Result. The student class has data members such as roll no, name etc. Create a class Exam by inheriting the Student class. The Exam class adds data members representing the marks scored in six subjects. Derive the Result from class Exam and it has its own members such as total marks and average. Calculate the total marks and average. */
import java.util.Scanner;
class Student{ //not working as public class
  int rollNo;
  String studentName;
  public Student(){
    rollNo=0;
    studentName="";
  }
  public void setStudent(){
    Scanner nameObj = new Scanner(System.in);
    System.out.println("Enter Student Name : ");
    studentName = nameObj.nextLine();
    Scanner rollObj = new Scanner(System.in);
    System.out.println("Enter Student Roll Number : ");
    rollNo = rollObj.nextInt();
  }
  public void putStudent(){
    System.out.println("Student Name : "+studentName);
    System.out.println("Student Roll Number : "+rollNo);
  }
}
class Exam extends Student{
  int marks1,marks2,marks3,marks4,marks5,marks6;

  public Exam(){
    marks1=0;marks2=0;marks3=0;marks4=0;marks5=0;marks6=0;
  }
  public void setMarks(){
    this.setStudent();
    Scanner marks1Obj = new Scanner(System.in);
    Scanner marks2Obj = new Scanner(System.in);
    Scanner marks3Obj = new Scanner(System.in);
    Scanner marks4Obj = new Scanner(System.in);
    Scanner marks5Obj = new Scanner(System.in);
    Scanner marks6Obj = new Scanner(System.in);

    System.out.println("Enter marks obtained in 6 separate subjects : ");
    System.out.println("Subject 1 : ");
    marks1 = marks1Obj.nextInt();
    System.out.println("Subject 2 : ");
    marks2 = marks2Obj.nextInt();
    System.out.println("Subject 3 : ");
    marks3 = marks3Obj.nextInt();
    System.out.println("Subject 4 : ");
    marks4 = marks4Obj.nextInt();
    System.out.println("Subject 5 : ");
    marks5 = marks5Obj.nextInt();
    System.out.println("Subject 6 : ");
    marks6 = marks6Obj.nextInt();
  }
}
class Result extends Exam{
  int totalMarks;
  float averageMarks;
  public Result(){
    totalMarks=0;
    averageMarks=0.0f;
  }
  public void findTotalMarks(){
   this.setMarks();
   totalMarks= this.marks1+this.marks2+this.marks3+this.marks4+this.marks5+this.marks6;
  }
  public void findAverageMarks(){
    averageMarks= (this.marks1+this.marks2+this.marks3+this.marks4+this.marks5+this.marks6)/6;
  }
  public void displayAll(){
    this.putStudent();
    System.out.println("Total Marks Obtained by Student : "+totalMarks+"(out of 600)");
    System.out.println("Average Marks Obtained by Student : "+averageMarks+"(out of 100)");
  }
  public static void main(String[] args){
    Result r1 = new Result();
    r1.findTotalMarks();
    r1.findAverageMarks();
    r1.displayAll();

  }
}
