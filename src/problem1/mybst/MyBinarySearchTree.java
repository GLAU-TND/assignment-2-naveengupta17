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
    private TreeNode<E> root;
    private int noOfNodes = 0;
    int counter = 0;

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
        root = addRecursive(root, data);
        noOfNodes++;
        return true;

    }

    public void visit(E data) {
        System.out.print(data + " ");
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void printLeftChild(TreeNode<E> currentNode) {
        if (currentNode != null) {
            if (currentNode.getLeftChild() != null) {
                visit(currentNode.getLeftChild().getData());
            }
            printLeftChild(currentNode.getLeftChild());
            printLeftChild(currentNode.getRightChild());
        }
    }

    public int numberofNodeWithNoLeftChild(TreeNode<E> currentNode) {
        if (currentNode != null) {
            if (currentNode.getLeftChild() == null) {
                counter++;
            }
            numberofNodeWithNoLeftChild(currentNode.getRightChild());
            numberofNodeWithNoLeftChild(currentNode.getLeftChild());


        }
        return counter;
    }

    public TreeNode<E> getRoot() {
        return root;
    }


}
