/*******************************************************************************
 *                               class Node                                    *
 * Chris Wright                                                                *
 * Version 1.0.0  11/5/2022                                                    *
 *                                                                             *
 * This class constructs a Node class for a binary tree.                       *
 *                                                                             *
 * public Node()                                                               *
 *    default constructor                                                      *
 * public Node(Entry)                                                          *
 *    constructor                                                              *
 * public void add(Entry)                                                      *
 *    adds node to tree                                                        *
 * public void print()                                                         *
 *    recursively prints pre-order depth-first traversal                       *
 * public String find(int)                                                     *
 *    recursively finds and returns value associated with key or empty string  *
 *    if not found                                                             *
 ******************************************************************************/
package binSearchTree;

public class Node {

   public Entry value = new Entry();  //data to be stored
   public Node left,                  //left child
               right;                 //right child
 
   public Node() {
      this.left = null;
      this.right = null;  
   }
 
   public Node(Entry entry) {
      this.value = entry;
      this.left = null;
      this.right = null;
   }

   public void add(Entry entry) {
      if (entry.key < this.value.key) {
         if (this.left != null)               //if left child exists
            left.add(entry);                  //add to left child
         else {
            Node node = new Node(entry);      //else add left child node
            left = node;                      //point left to new node
         }
      }
      else if (entry.key > this.value.key) {
         if (this.right != null)              //if right child exists 
            right.add(entry);                 //add to right child
         else { 
            Node node = new Node(entry);      //else add right child node
            right = node;                     //point right to new node
         }
      }
   }

   public void print(int indent) {
      for (int i = 0; i < indent * 3; i++)
         System.out.print(" ");
      System.out.print("+--- " + this.value.key + ": ");
      System.out.println(this.value.value);
      if (left != null)  //if left child exists
      //recursive call to print left child and increase indent
         left.print(indent + 1);   
      if (right != null) //if right child exists
      //recursive call to print right child and increase indent
         right.print(indent + 1);  
   }

   public String find(int key) {
      if (this.value.key == key)  //check this node entry for match
         return this.value.value;
      //if desired key is less than this key and left child exists
      else if ((key < this.value.key) && (this.left != null))  
         return left.find(key);   //recursive call on left child
      //if desired key is more than this key and right child exists
      else if ((key > this.value.key) && (this.left != null))
         return right.find(key);  //recursive call on right child
      else
         return "";               //return empty string if not found
   }
}