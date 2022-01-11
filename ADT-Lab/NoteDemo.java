package lab2_ADT;

import java.util.*;
import java.math.*;

public class NoteDemo {
	public static void main(String[] args) {

      double value;
      String length;
      int tempLength;
    
      Scanner input = new Scanner(System.in);
      
      NoteDataStructure n = new NoteDataStructure();
      
      System.out.println("Please enter a value for your note\n"+
                         "between -9 and 2:");
      value = input.nextDouble();
    
      System.out.println("Please enter the number between 1-5\n" +
                         "you would like to represent\n" +
                         "the length of your note.\n"+
                         "1. Whole\n" +
                         "2. Half\n" +
                         "3. Quarter\n" +
                         "4. Eighth\n" +
                         "5. Sixteenth");
      tempLength = input.nextInt();
    
      while(tempLength > 5 || tempLength < 1)
      {
         System.out.println("Invalid Entry");
      }
      if(tempLength == 1)
      {
         length = "whole";
      }
      else if(tempLength == 2)
      {
         length = "half";
      }
      else if(tempLength == 3)
      {
         length = "quarter";
      }
      else if(tempLength == 4)
      {
         length = "eighth";
      }
      else if(tempLength == 5)
      {
         length = "sixteenth";
      }
      else
      {
         length = "Invalid";
      }
      System.out.println(n.getLetter());
      System.out.println("Length: " + n.getLength());
      System.out.println("Value: " + n.value);
      System.out.println(n.getKeyColor() + "(" + n.getSharp() + ")");
      System.out.println(n.getFrequency());
    
    }

}
