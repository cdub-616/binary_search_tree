/*******************************************************************************
 *                          class BinarySearchTree                             *
 * Chris Wright                                                                *
 * Version 1.0.0  11/5/2022                                                    *
 *                                                                             *
 * This class constructs a BinarySearchTree class.                             *
 *                                                                             *
 * public BinarySearchTree()                                                   *
 *    default constructor                                                      *
 * public String about()                                                       *
 *    returns author's name as string                                          *
 * public void add(Entry)                                                      *
 *    adds entry to tree                                                       *
 * public String find(int)                                                     *
 *    initiates find starting at root node                                     *
 * public void print()                                                         *
 *    initiates print starting at root node                                    *
 ******************************************************************************/
package binSearchTree;

public class BinarySearchTree {

   private Node root_ptr = new Node();  //point to root node of tree
   public int initInd = 0;          //initial indent is zero

   public BinarySearchTree() {
   root_ptr = null;
   }

   public String about() {
      return "Chris Wright";
   }

   public void add(Entry entry) {         
      if (root_ptr != null)                   //if root node exists
      root_ptr.add(entry);                 //add new node to tree
      else {
         Node newRoot = new Node(entry);  //else create new node
         root_ptr = newRoot;                  //new node becomes root
      }
   }

   public String find(int key) {
      return root_ptr.find(key);              //start recursive call at root
   }

   public void print() {
   root_ptr.print(initInd);                //start recursive call at root
   }
}