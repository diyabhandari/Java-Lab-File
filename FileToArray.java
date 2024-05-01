/*Question Statement : WAP to read the contents of a file into array */
import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class FileToArray {
  public static void main(String[] args) {
    List<String> listOfStrings = new ArrayList<>();
    try (FileReader fr = new FileReader("fileDiya.txt")) {
      StringBuilder s = new StringBuilder(); // Using StringBuilder for efficiency
      int charInt;
      while ((charInt = fr.read()) != -1) {
          char ch = (char) charInt;
          if (ch == '\n' || ch == ' ' || ch == ',') {
              listOfStrings.add(s.toString());
              s.setLength(0); // Clears string content
          } else {
              s.append(ch); // Append new char
          }
      }
      if (s.length() > 0) {
          // Append last line
          listOfStrings.add(s.toString());
      }
      String[] array = listOfStrings.toArray(new String[0]); //conversion to regular array as required in the question 
      for (String str : array) { // For each string in array
          System.out.println(str);
      }
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}
//this isnt line by line !

