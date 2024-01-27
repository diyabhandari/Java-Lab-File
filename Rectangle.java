/*  Question statement : Create a class named Rectangle with two data members, length and breadth, and a method to calculate area of rectangle. The class has 3 constructors:
1.	Having no parameter, values of both data members are assigned 0.
2.	Having 2 parameters. The two numbers are assigned as length and breadth.
3.	Having one number as parameter. Both length and breadth are assigned that number.
Now create objects of rectangle class having none, one and two parameters and print their areas. */

import java.util.Scanner;
public class Rectangle {
  int length,breadth;
  //constructors
  public Rectangle(){
    length=0;breadth=0;
  }
  public Rectangle(int l,int b){
    length=l;breadth=b;
  }
  public Rectangle(int dimension){
    length=dimension;breadth=dimension;
  }
  //methods
  public void calcArea(){
    int area;
    area=length*breadth;
    System.out.println("The area of this rectangle is : "+area);
  }
  public static void main(String[] args){
    int ch=1;
    int flag1=0,flag2=0,flag3=0; //each option is only made to be run once
    while(ch==1){
      System.out.println("Menu");
      System.out.println("Press 1 to calculate area using default values ");
      System.out.println("Press 2 to input separate values for length and breadth to calculate area ");
      System.out.println("Press 3 to input the same value for length and breadth to calculate area ");
      System.out.println("Press 4 to exit ");
      Scanner menuObj= new Scanner(System.in);
      int menu = menuObj.nextInt();
      switch(menu){
        case 1:
          if(flag1==0){
            Rectangle r1= new Rectangle();
            r1.calcArea();
            flag1=1;
          }
          else{
            System.out.println("Each option on the menu can only be run once. This was already run.");
          }
          break;
        case 2:
          if(flag2==0){
            int len1,breadth1;
            Scanner lenObj=new Scanner(System.in);
            System.out.println ("Enter length of rectangle : ");
            len1 = lenObj.nextInt();
            Scanner breadthObj = new Scanner(System.in);
            System.out.println ("Enter breadth of rectangle : ");
            breadth1 = breadthObj.nextInt();
            Rectangle r2 = new Rectangle(len1,breadth1); //calling parameterised constructor 
            r2.calcArea();
            flag2=1;
          }
          else{
            System.out.println("Each option on the menu can only be run once. This was already run.");
          }
          break;
        case 3:
          if(flag3==0){
            int dimension;
            Scanner dimObj = new Scanner(System.in);
            System.out.println("Enter value to assign both length and breadth of rectangle : ");
            dimension = dimObj.nextInt();
            Rectangle r3 = new Rectangle(dimension);
            r3.calcArea();
            flag3=1;
          }
          else{
            System.out.println("Each option on the menu can only be run once. This was already run.");
          }
          break;
        case 4:
          System.out.println("Thankyou");
          ch=0;
          break;
      }
    }

  }
  
}
