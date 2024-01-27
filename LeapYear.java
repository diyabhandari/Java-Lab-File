public class LeapYear
{
  static void checkLeap(int yr){
      
    if(yr%100==0 && !(yr%400==0)){
        System.out.println("The entered year is not a leap year");
    }
    else if(yr%4 == 0){
        System.out.println("The entered year is a leap year");
    }
    else{
        System.out.println("The entered year is not a leap year");
    }
  }
  public static void main(String []args) {
    int year1 = 1900;
    int year2 = 2019;
    int year3 = 2004;
    int year4 = 1800;
    checkLeap(year1);
    checkLeap(year2);
    checkLeap(year3);
    checkLeap(year4);
  }
}

