/*Question Statement : Write a program to create a banking system with 3 classes : bank, saving account and current account. The bank class should have a list of accounts and methods for adding them. Consider one interface account with methods deposit, withdraw, interest and newBalance. Saving account and current account classes should implement the account interface. */
//figure out how to do this with a single main class !
import java.util.Scanner;
interface Account{
  void deposit();
  void withdraw();
  void interest();
  void newBalance();
}
class BankSystem{
  int accountId;
  String accountName;
  BankSystem(){
    accountId =0;
    accountName="";
  }
  public void getDetails(){
    Scanner idObj = new Scanner(System.in);
    System.out.println("Enter account ID : ");
    accountId = idObj.nextInt();
    Scanner nameObj = new Scanner(System.in);
    System.out.println("Enter account name : ");
    accountName = nameObj.nextLine();
  }
  public void displayDetails(){ //adds details obtained in this class' getdetails() to the account details we will get in later classes
    System.out.println("Account ID : "+accountId);
    System.out.println("Account Name : "+accountName);
  }
}
class SavingsAccount extends BankSystem implements Account{
  float amount,newAmount,interestOnAmount; //make newBalance method print everything finally , newBalance adds interest to principal amount to get final amount;
  SavingsAccount(){
    amount = 0.0f;
    newAmount=0.0f;
    interestOnAmount=0.0f;
  }
  public void get(){
    this.getDetails();
  }
  public void deposit(){
    float depositAmount;
    Scanner depObj = new Scanner(System.in);
    System.out.println("Enter amount to deposit : ");
    depositAmount = depObj.nextFloat();
    amount+=depositAmount;
    System.out.println("Available balance after deposit : "+amount);
  }
  public void withdraw(){
    float withdrawAmount;
    Scanner withObj = new Scanner(System.in);
    System.out.println("Enter amount to withdraw : ");
    withdrawAmount = withObj.nextFloat();
    if(amount>withdrawAmount){
      amount-=withdrawAmount;
      System.out.println("Available balance after deposit : "+amount);
    }
    else{
      System.out.println("Amount available is less than requested amount for withdrawal.");
    }  
  }
  public void interest(){
    float rate=7.1f, years;
    Scanner yearsObj = new Scanner(System.in);
    System.out.println("Enter duration that amount will stay in bank : ");
    years = yearsObj.nextFloat();
    interestOnAmount = (amount*rate*years)/100;
    System.out.println("The predicted interest on balance present : "+interestOnAmount);
  }
  public void newBalance(){
    newAmount= amount + interestOnAmount;
    this.displayDetails(); //added details from BankSystem
    System.out.println("Using the previously calculated interest, it is predicted that your total balance in the given time will be : "+newAmount);
    System.out.println("Current Savings : "+amount);
  }
  public static void main(String[] args) {
    int ch=1,menu;
    Scanner menuObj = new Scanner(System.in); 
    SavingsAccount[] s = new SavingsAccount[3]; //this declares an array object and allocates space for 3 accounts, but it does not create these account objects, we have to do that separately
    for(int i =0;i<3;i++){
      s[i] = new SavingsAccount();
      s[i].get();
      while(ch==1){
        System.out.println("Menu");
        System.out.println("Press 1 to deposit amount to current account");
        System.out.println("Press 2 to withdraw amount from current account");
        System.out.println("Press 3 to calculate interest ");
        System.out.println("Press 4 to exit");
        menu = menuObj.nextInt();
        switch(menu){
          case 1:
            s[i].deposit();
            break;
          case 2:
            s[i].withdraw();
            break;
          case 3:
            s[i].interest();
            break;
          case 4:
            ch=0;
            break;
        }
        s[i].newBalance();
      }
    }
  }
}
class CurrentAccount extends BankSystem implements Account{
  float amount,newAmount,interestOnAmount; //make newBalance method print everything finally , newBalance adds interest to principal amount to get final amount;
  CurrentAccount(){
    amount = 0.0f;
    newAmount=0.0f;
    interestOnAmount=0.0f;
  }
  public void get(){
    this.getDetails();
  }
  public void deposit(){
    float depositAmount;
    Scanner depObj = new Scanner(System.in);
    System.out.println("Enter amount to deposit : ");
    depositAmount = depObj.nextFloat();
    amount+=depositAmount;
    System.out.println("Available balance after deposit : "+amount);
  }
  public void withdraw(){
    float withdrawAmount;
    Scanner withObj = new Scanner(System.in);
    System.out.println("Enter amount to withdraw : ");
    withdrawAmount = withObj.nextFloat();
    if(amount>withdrawAmount){
      amount-=withdrawAmount;
      System.out.println("Available balance after deposit : "+amount);
    }
    else{
      System.out.println("Amount available is less than requested amount for withdrawal.");
    }  
  }
  public void interest(){
    interestOnAmount = 0.0f; //in case its run again
    float rate=5.1f, years;
    Scanner yearsObj = new Scanner(System.in);
    System.out.println("Enter duration that amount will stay in bank : ");
    years = yearsObj.nextFloat();
    interestOnAmount = (amount*rate*years)/100;
    System.out.println("The predicted interest on balance present : "+interestOnAmount);
  }
  public void newBalance(){
    newAmount= amount + interestOnAmount;
    this.displayDetails(); //added details from BankSystem
    System.out.println("Using the previously calculated interest, it is predicted that your total balance in the given time will be : "+newAmount);
    System.out.println("Current Balance : "+amount);
  }
  public static void main(String[] args) {
    int ch=1,menu;
    Scanner menuObj = new Scanner(System.in); 
    CurrentAccount[] c = new CurrentAccount[3];
    for(int i =0;i<3;i++){
      c[i] = new CurrentAccount();
      c[i].get();
      while(ch==1){
        System.out.println("Menu");
        System.out.println("Press 1 to deposit amount to current account");
        System.out.println("Press 2 to withdraw amount from current account");
        System.out.println("Press 3 to calculate interest ");
        System.out.println("Press 4 to exit");
        menu = menuObj.nextInt();
        switch(menu){
          case 1:
            c[i].deposit();
            break;
          case 2:
            c[i].withdraw();
            break;
          case 3:
            c[i].interest();
            break;
          case 4:
            ch=0;
            break;
        }
        c[i].newBalance();
      }
    }
  }
}

