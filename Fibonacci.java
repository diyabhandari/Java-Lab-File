public class Fibonacci
{
  static void fibonacci(int limit){
    int a=0;
    int b=1;
    System.out.println("Here is the Series: ");
    System.out.println(a);
    System.out.println(b);
    for(int i=2;i<limit;i++){
        int c=a+b;
        System.out.println(c);
        a=b;
        b=c;
    }   
  }
  public static void main(String[] args) {
    int lim1 = 3;
    int lim2 = 5;
    fibonacci(lim1);
    fibonacci(lim2);
  }
}