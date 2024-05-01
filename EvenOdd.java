
//write a java program to read file line by line and store in array
import java.util.*;
import java.io.*;
public class EvenOdd {
  public static void main(String[] args){
    try{
      FileWriter fp = new FileWriter("EvenOdd.txt");
      byte a[]={0,1,2,3,4,5,6,7,8,9};
      for(int i=0;i<a.length;i++){
        fp.write(a[i]+"\n");
      }
      fp.close();
      System.out.println("File Created Successfully");
      FileReader fr = new FileReader("EvenOdd.txt");
      FileWriter e = new FileWriter("even.txt");
      FileWriter o = new FileWriter("odd.txt");
      int ch=0;
      while((ch=fr.read())!=-1){
        if(ch%2==0) {
          e.write(ch);
        }
        else {
          o.write(ch);
        }
      }
      fr.close();
      e.close();
      o.close();
    }
    catch(IOException p){
      System.out.println(p);
    }
  }
}
