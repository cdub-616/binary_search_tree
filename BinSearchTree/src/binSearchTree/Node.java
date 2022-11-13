package binSearchTree;

public class Node {

   public Entry value = new Entry();
   public Node left,
               right;
 
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
         if (this.left != null)
            left.add(entry);
         else
            left.value = entry;
      }
      else if (entry.key > this.value.key) {
         if (this.right != null)
            right.add(entry);
         else
            right.value = entry;
      }
   }

   public void print(int indent) {
      for (int i = 0; i < indent; i++)
         System.out.print(" ");
      System.out.print("+---");
      System.out.println(this.value.value);
      left.print(indent + 1);
      right.print(indent + 1);
   }

   public String find(int key) {
      if (this.value.key == key)
         return this.value.value;
      else if ((key < this.value.key) && (this.left != null))
         return left.find(key);
      else if ((key > this.value.key)&& (this.left != null))
         return right.find(key);
      else
         return "";
   }
}