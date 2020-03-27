/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree<E> implements TreeAdt<E> {
    int counter = 0;
    private TreeNode<E> root;
    private int noOfNodes = 0;

    private TreeNode<E> addRecursive(TreeNode<E> currentNode, E data) {
        if (currentNode == null) {
            return new TreeNode<E>(data);
        }
        if (((Integer) data) < (Integer) currentNode.getData()) {
            currentNode.setLeftChild(addRecursive(currentNode.getLeftChild(), data));

        } else if (((Integer) data) >= (Integer) currentNode.getData()) {
            currentNode.setRightChild(addRecursive(currentNode.getRightChild(), data));
        }
        return currentNode;

    }


    @Override
    public boolean add(E data) {
        return false;

    }




}

