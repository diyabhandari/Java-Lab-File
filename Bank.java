/* Question Statement : design a class to represent a bank account. it must have following data members : name of depositer, account number, type of account, balance amount. it must have the following methods: to deposit amount, to withdraw amount after checking balance and to display name and balance. use constructors to initialize data members (default and parameterized). */
import java.util.Scanner;
public class Bank{
  String accountName, typeOfAccount;
  int accountNumber;
  float balance;

  //constructors
  public Bank(){
    accountName = "";
    typeOfAccount ="";
    accountNumber = 0;
    balance = 0.0f; //why f here?
  }
  public Bank(String accountName,int accountNumber,String typeOfAccount,float balance){
    this.accountName=accountName;
    this.accountNumber=accountNumber;
    this.typeOfAccount=typeOfAccount;
    this.balance=balance;
  }
  //methods
  public void depositAmount(float amount){
    System.out.println("Account balance is :"+balance);
    balance+=amount;
    System.out.println("Account balance after deopsit is :"+balance);
  }
  public void withdrawAmount(float amount){
    System.out.println("Account balance is :"+balance);
    if(amount>balance){
      System.out.println("Amount to withdraw is greater than amount available in account");
    }
    else{
      balance-=amount;
      System.out.println("Account balance after withdrawal is :"+balance);
    } 
  }
  public void display(){
    System.out.println("Account Name :"+accountName);
    System.out.println("Balance :"+balance);
  }
  //main
  public static void main(String[] args){
    String name;
    int accNo;
    String accType;
    Scanner myName = new Scanner(System.in);
    System.out.println("Enter your name :");
    name = myName.nextLine();
    Scanner myNo = new Scanner(System.in);
    System.out.println("Enter account number :");
    accNo = myNo.nextInt();
    Scanner myType = new Scanner(System.in);
    System.out.println("Enter your account type :");
    accType = myType.nextLine();
    //make object
    Bank b1 = new Bank(name,accNo,accType,0.0f); 
    int ch=1;
    while(ch==1){
      System.out.println("Press 1 to deposit amount ");
      System.out.println("Press 2 to withdraw amount ");
      System.out.println("Press 3 to exit ");
      Scanner menuObj = new Scanner(System.in);
      System.out.println("Enter your choice :");
      int menuChoice = menuObj.nextInt();
      switch(menuChoice){
        case 1:
          Scanner depositObj = new Scanner(System.in);
          System.out.println("Enter an amount to deposit : ");
          float dep = depositObj.nextFloat();
          b1.depositAmount(dep);
          break;
        case 2:
          Scanner withdrawObj = new Scanner(System.in);
          System.out.println("Enter an amount to withdraw : ");
          float with = withdrawObj.nextFloat();
          b1.withdrawAmount(with);
          break;
        case 3:
          System.out.println("Thankyou");
          ch=0; //breaks out of loop
          break;
      }
    }
  }
}
