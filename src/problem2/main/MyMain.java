/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(80);
        myBinarySearchTree.add(54);
        myBinarySearchTree.add(588);
        myBinarySearchTree.add(46);
        myBinarySearchTree.add(87);
        System.out.println("Post order traversing");
        myBinarySearchTree.traversePostOrder(myBinarySearchTree.getRoot());
        System.out.println();
        System.out.println("Pre order traversing");
        myBinarySearchTree.traversePreOrder(myBinarySearchTree.getRoot());

    }


}
