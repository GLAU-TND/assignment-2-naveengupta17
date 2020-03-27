/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(5);
        myBinarySearchTree.add(44);
        myBinarySearchTree.add(2);
        myBinarySearchTree.add(11);
        myBinarySearchTree.printLeftChild(myBinarySearchTree.getRoot());
        System.out.println();
        System.out.println(myBinarySearchTree.numberOfNodeWithNoLeftChild(myBinarySearchTree.getRoot()));
    }

}
