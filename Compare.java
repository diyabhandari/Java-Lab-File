//18
/*Question Statement - WAP to compare two arrayLists */
import java.util.*;
public class Compare 
{
  public static void main(String[] args){
    int choice=1,index1=0,index2=0,index;
    StringBuffer s=new StringBuffer();
    List<String> listOfStrings1 = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter words into first ArrayList : ");
    while(choice ==1){
      s.setLength(0); // Clears string content
      System.out.print("Enter Word : ");
      s.append(sc.nextLine());
      listOfStrings1.add(s.toString()); //cuz we can only add strings 
      index1++;
      System.out.print("Press 1 to continue adding words : ");
      choice = sc.nextInt();
      sc.nextLine(); // Consume newline character
    }
    choice=1;
    List<String> listOfStrings2 = new ArrayList<>();
    System.out.println("Enter words into second ArrayList : ");
    while(choice ==1){
      s.setLength(0);
      System.out.print("Enter Word : ");
      s.append(sc.nextLine());
      listOfStrings2.add(s.toString());
      index2++;
      System.out.print("Press 1 to continue adding words : ");
      choice = sc.nextInt();
      sc.nextLine(); // Consume newline character
    }
    String noMoreLeft;
    if(index1>index2){
      index=index2;
      noMoreLeft="There are no more elements in ArrayList2 to be compared with the remaining elements of ArrayList1";
    }
    else{
      index=index1;
      noMoreLeft="There are no more elements in ArrayList1 to be compared with the remaining elements of ArrayList2";
    }
    for(int i=0;i<index;i++){
      if(listOfStrings1.get(i).equals(listOfStrings2.get(i))){ //.equalsIgnoresCase() also 
      //available
        System.out.println("The words at index "+i+" of both strings are the same.");
      }
      else{
        System.out.println("The words at index "+i+" of both strings are NOT the same.");
      }
    }
    if(index1!=index2){
      System.out.println(noMoreLeft);
    }  
  }
}

