/*******************************************************************************
 *                      class BinarySearchTree_Demo                            *
 * Chris Wright                                                                *
 * Version 1.0.0  11/5/2022                                                    *
 *                                                                             *
 * This class provides a demonstration of the BinarySearchTree class.          *
 *                                                                             *
 * public static BinarySearchTree createTree(String)                           *
 *    accepts string file name and returns BinarySearchTree                    *
 ******************************************************************************/
package binSearchTree;

import java.io.File;
import java.util.Scanner;

public class BinarySearchTree_Demo {

   public static String halCal = "halloween calories.txt",
                        halCal2 = "halloween calories 2.txt",
                        pok = "pokemon.txt",
                        years = "years.txt";

   public static void main(String[] args) {
   
   //print trees
   System.out.println("File: " + halCal);
   BinarySearchTree hal = createTree(halCal);
   hal.print();
   System.out.println();
   System.out.println("File: " + halCal2); 
   BinarySearchTree hal2 = createTree(halCal2);
   hal2.print();
   System.out.println();
   System.out.println("File: " + pok);
   BinarySearchTree pk = createTree(pok);
   pk.print();
   System.out.println();
   System.out.println("File: " + years);
   BinarySearchTree yrs = createTree(years);
   yrs.print();
   System.out.println();
   
   //demo other BinarySearchTree methods
   System.out.print("Who wrote this code? ");
   System.out.println(yrs.about());
   System.out.print("What does the tree say happened in 1839? ");
   System.out.println(yrs.find(1839));
   System.out.print("Cool!  What about in 1900? ");
   System.out.println(yrs.find(1900));
   System.out.println("Looks like the tree didn't have anything for 1900.");
}

   public static BinarySearchTree createTree(String text) {

      BinarySearchTree tree = new BinarySearchTree();

      try {                          //try to open file
         File file = new File(text);
         Scanner sc = new Scanner(file);
      
         while (sc.hasNextLine()) {  //while there are more lines
            String[] token = sc.nextLine().split(",", 2);
            if (token.length > 1) {  //skip first and last lines
               int key = Integer.parseInt(token[0]);   
               String value = token[1];
               Entry line = new Entry(key, value);  
               tree.add(line);       //add new entry to tree
            }
         }
         sc.close();
      }
      catch(Exception e) {           //if there's problem with file
         System.out.println("Error processing file!");
         System.out.println(e.toString());
      }
      return tree;
   }
}