import java.io.*;
import java.util.*;

/** 
 * Клас Lab2 реалізує приклад програми до лабораторної роботи №2 
 * 
 * @author No Information 
 * @version 1.0 
 * @since version 1.0 
 * 
 */ 

public class lab2 {
	/** 
	 * Статичний метод main є точкою входу в програму 
	 * 
	 * @param args 
	 * @throws FileNotFoundException 
	 * 
	 */ 
	
   public static void main(String[] args) throws FileNotFoundException{
	  
	  int k;
	  Scanner in = new Scanner(System.in);
	  File dataFile = new File("MyFile.txt"); 
	  PrintWriter fout = new PrintWriter(dataFile);
	  System.out.print("Enter matrix size: ");
      k = in.nextInt();
      in.nextLine();
      
      char[][] twoDimenArray = new char[k][];
      for(int r=0; r<k; r++) {
      if(r%2==0) {
    	  twoDimenArray[r] = new char[k];
      }
      else {
      twoDimenArray[r] = new char[0];
      	}
  }
      
      
      String symboll ;
      System.out.print("Enter a placeholder character: ");
      symboll = in.nextLine();
      //in.nextLine();
      if(symboll.length() > 1) {
    	  System.out.print("\nToo many placeholder characters! ");
      }
      else if (symboll.length() < 1) {
    	  System.out.print("\nNo placeholder entered!");
      }
      else {
      
      //initializing array
      for(int row=0; row < twoDimenArray.length; row++){

         for(int col=0; col < twoDimenArray[row].length; col++){
            twoDimenArray[row][col] = (char) symboll.codePointAt(0);
         }
      }

      //printing array
      for(int row=0; row < twoDimenArray.length; row++){
         System.out.println();
         for(int col=0; col < twoDimenArray[row].length; col++){
            System.out.print(twoDimenArray[row][col] + " ");
            fout.print(twoDimenArray[row][col] + " ");
         	}
      	}
      }
      fout.flush(); 
      fout.close();
   }
}