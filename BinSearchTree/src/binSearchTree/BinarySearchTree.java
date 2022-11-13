package binSearchTree;

public class BinarySearchTree {

   public Node root;
   public int initInd = 0;

   public BinarySearchTree() {
      Node root = new Node();
   }

   public BinarySearchTree(Node node) {
      root = node;
   }

   public String about() {
      return "Chris Wright";
   }

   public void add(Entry entry) {
      if (root != null)
         root.add(entry);
      else {
         Node newRoot = new Node(entry);
         root = newRoot;
      }
   }

   public String find(int key) {
      return root.find(key);
   }

   public void print() {
      root.print(initInd);
   }
}