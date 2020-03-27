/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
import problem1.mybst.MyBinarySeachTree;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
  public static void main(String[] args)
    {
        MyBinarySearchTree tree=new MyBinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.insert(12);
        System.out.println("PreOrder Traversal : ");
        tree.preOrderTraverse();
        System.out.println();
        System.out.println("PostOrder Traversal : ");
        tree.postOrderTraverse();
        System.out.println();
        System.out.println("Condition A:Root element is placed at opposite end, i.e. "+
                "in pre order root is the first element where as in post order root is the last element is TRUE");
        System.out.println("Condition B:They have common mid point,"+
                "i.e. both the traversal will give same element at the mid position for odd number of nodes is FALSE");
    }
  
}
