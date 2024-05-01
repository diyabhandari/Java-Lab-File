//17
/*Question Statement - Write a program to find the longest word in a text file */
import java.io.*;
import java.util.*;
//add all strings delimited by a space to an array. must also change string for newline. find the longest string in that array
public class FindLongest {
  public static void main(String[] args) {
    List<String> listOfWords = new ArrayList<>();
    try (FileReader fr = new FileReader("fileDiya.txt")) {
      StringBuilder s = new StringBuilder(); // Using StringBuilder for efficiency
      int charInt;
      while ((charInt = fr.read()) != -1) {
          char ch = (char) charInt;
          if (ch == '\n' || ch == ' ' || ch == ',') {
              listOfWords.add(s.toString());
              s.setLength(0); // Clears string content
          } else {
              s.append(ch); // Append new char
          }
      }
      if (s.length() > 0) {
          // Append last line
          listOfWords.add(s.toString());
      }
      //now that all words have been read into the arrayList individually, we can compare them 
      //to find the longest one
  }catch(IOException e){
    System.out.println(e);
  }  
  int largestString = listOfWords.get(0).length(); //len of word at first index
  int index = 0; //index of longest word
  for(int i = 0; i < listOfWords.size(); i++)
  {
    if(listOfWords.get(i).length() > largestString)
    {
      largestString = listOfWords.get(i).length();
      index = i;
    }
  }
  System.out.println("Longest word"+" '" +listOfWords.get(index)+"' " );  
  }
}
