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

   private Node root = new Node();
   public int initInd = 0;

   public BinarySearchTree() {
      root = null;
   }

   public String about() {
      return "Chris Wright";
   }

   public void add(Entry entry) {         
      if (root != null)                   //if root node exists
         root.add(entry);                 //add new node to tree
      else {
         Node newRoot = new Node(entry);  //else create new node
         root = newRoot;                  //new node becomes root
      }
   }

   public String find(int key) {
      return root.find(key);
   }

   public void print() {
      root.print(initInd);
   }
}