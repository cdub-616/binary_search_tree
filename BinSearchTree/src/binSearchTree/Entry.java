/*******************************************************************************
 *                               class Entry                                   *
 * Chris Wright                                                                *
 * Version 1.0.0  11/5/2022                                                    *
 *                                                                             *
 * This class constructs an Entry class containing an integer and a String.    *
 *                                                                             *
 * public Entry()                                                              *
 *    default constructor                                                      *
 * public Entry(int, String)                                                   *
 *    constructor                                                              *
 ******************************************************************************/
package binSearchTree;

public class Entry {

   public int key;       //used to sort data
   public String value;  //data associated with key
 
   public Entry() {
      this.key = -1;
      this.value = "";
   }
 
   public Entry(int ky, String val) {
      this.key = ky;
      this.value = val;
   }
}