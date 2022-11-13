package binSearchTree;

import java.io.File;
import java.util.Scanner;

public class BinarySearchTree_Demo {

   public static String halCal = "halloween calories.txt",
                        halCal2 = "halloween calories2.txt",
                        pok = "pokemon.txt",
                        years = "years.txt";

   public static void main(String[] args) {
   
 //sort and print files
   //System.out.println(halCal);
   //BinarySearchTree hal = createTree(halCal);
   //hal.print();
   //System.out.println();
   //System.out.println(halCal2); 
   //BinarySearchTree hal2 = createTree(halCal2);
   //hal2.print();
   //System.out.println();
   //System.out.println(pok);
   //BinarySearchTree pk = createTree(pok);
   //pk.print();
   //System.out.println();
   System.out.println(years);
   BinarySearchTree yrs = createTree(years);
   yrs.print();
   //System.out.println();
}

   public static BinarySearchTree createTree(String text) {

      BinarySearchTree tree = new BinarySearchTree();

      try {  //try to open file
         File file = new File(text);
         Scanner sc = new Scanner(file);
      
         while (sc.hasNextLine()) {  //while there are more lines
            String[] token = sc.nextLine().split(",", 2);
            if (token.length > 1) {  //skip first and last lines
               int key = Integer.parseInt(token[0]);   
               String value = token[1];
               Entry line = new Entry(key, value);
               tree.add(line);
            }
         }
         sc.close();
      }
      catch(Exception e) {  //if there's a problem with file
         System.out.println("Error processing file!");
         System.out.println(e.toString());
      }
      return tree;
   }
}