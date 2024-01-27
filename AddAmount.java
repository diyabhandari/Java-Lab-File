/* Question Statement :  Suppose you have a piggy bank with an initial amount of $50 and you have to add some more amount to it. Create a class AddAmount with data member nameAmount with an initial value of $50. Now make two constructors with :
1.	No parameter, no amount added to piggy bank.
2.	A parameter which is the amount that will be added to piggy bank.
Create an object of AddAmount class and display the final amount in the piggy bank.
*/
import java.util.Scanner;
public class AddAmount {
  int nameAmount=50;
  //constructors
  public AddAmount(){
    
    System.out.println("No amount was added to piggy bank ");
  }
  public AddAmount(int amt){
    nameAmount+=amt;
    System.out.println("An amount of $"+amt+" was added to the piggy bank.");
  }
  //methods
  public void display(){
    System.out.println("The total amount in the piggy bank is : $"+nameAmount);
  }
  public static void main(String[] args){
    System.out.println("Following is the case when no amount is added : ");
    AddAmount a1 = new AddAmount();
    a1.display();
    System.out.println("Now, enter value to add to amount in piggy bank : ");
    Scanner valueObj = new Scanner(System.in);
    int value = valueObj.nextInt();
    AddAmount a2 = new AddAmount(value);
    a2.display();
  }
}
