/*Question Statement : Write a program to create an interface resizable with two methods : resize width and resize height which allow an object to be resized. Create a class rectangle with the resizable interface*/
//by default methods of interface are public, so the methods of the class that implements this should also be public
import java.util.Scanner;
interface Resizable{
  void resizeWidth();
  void resizeHeight();
}
class ResizableRectangle implements Resizable {
  int width,height;
  ResizableRectangle(){
    width=0;height=0;
  }
  public void setRectangle(){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter width :");
    width = sc.nextInt();
    System.out.print("\nEnter height :");
    height = sc.nextInt();
  }
  public void resizeWidth(){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter new width :");
    width = sc.nextInt();
  }
  public void resizeHeight(){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter new height :");
    height = sc.nextInt();
  }
  public void showRectangle(){
    System.out.println("Width of Rectangle is : "+width);
    System.out.println("Height of Rectangle is : "+height);
  }
  public static void main(String[] args){
    ResizableRectangle r= new ResizableRectangle();
    r.setRectangle();
    Scanner sc = new Scanner(System.in);
    System.out.print("\nPress 1 to resize the rectangle before displaying, press any key to skip : ");
    int choice = sc.nextInt();
    if(choice==1){
      r.resizeHeight();
      r.resizeWidth();
      r.showRectangle();
    }
    else{
      r.showRectangle();
    }
  }
}

