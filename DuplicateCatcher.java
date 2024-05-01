/* Question Statement - WAP that reads a list of integers from the user and throws an exception if any number is duplicate (use Arithmetic Exception) */
import java.util.Scanner;
public class DuplicateCatcher {
  int[] listNum; //we can define size later, with user input
  int size;
  int[] tempListNum;
  DuplicateCatcher(){
    //do we need to initialise list ?
    size=0;
  }
  public void getList(){
    int newNum;
    Scanner sizeObj = new Scanner(System.in);
    System.out.print("\nEnter size of list of numbers : ");
    size = sizeObj.nextInt();
    int[] listNum = new int[size];
    int[] tempListNum = new int[size];
    Scanner numObj = new Scanner(System.in);

    for(int i=0;i<size;i++){
      System.out.print("\nEnter number : ");
      newNum = numObj.nextInt();
      for(int j=0;j<i;j++){
          listNum[i]=newNum;
      }
    }
    try{
      int flag=0;
      for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
          if(listNum[i]==tempListNum[j]){
            flag=1;
          }
        }
        if(flag==1){
          flag=0;
          continue;
        }
        else{
          for(int k=0;k<size;k++){
            if(listNum[i]==listNum[k]){
              throw new ArithmeticException("Duplicate entered");
            }
          }
        }
      }
    }
    catch(ArithmeticException e){
      System.out.println("Exception caught");
    }
  }
  public static void main(String[] args){
    DuplicateCatcher obj = new DuplicateCatcher();
    obj.getList();
  }
}
//only catches last one