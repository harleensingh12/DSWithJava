package com.harleensingh12.dsWithJava.runnable.binaryTree;

import java.util.Stack;

import com.harleensingh12.dsWithJava.common.binaryTree.BinaryTree;
import com.harleensingh12.dsWithJava.common.binaryTree.Node;

import lombok.extern.slf4j.Slf4j;

import static com.harleensingh12.dsWithJava.common.binaryTree.BinaryTree.NodePosition.LEFT;
import static com.harleensingh12.dsWithJava.common.binaryTree.BinaryTree.NodePosition.RIGHT;

@Slf4j
public class IterativeTraversals implements Runnable
{
    @Override
    public void run()
    {
        BinaryTree bt = new BinaryTree(Node.builder().data(1).build());
        Node root = bt.getRoot();

        bt.addNode(root, LEFT, 2);
        bt.addNode(root, RIGHT, 3);

        bt.addNode(root.left, LEFT, 4);
        bt.addNode(root.left, RIGHT, 5);

        bt.addNode(root.right, LEFT, 6);

        Node temp1 = new Node(root);
        Node temp2 = new Node(root);
        Node temp3 = new Node(root);
        preOrderTraverse(temp1);
        inOrderTraverse(temp2);
        postOrderTraverse(temp3);
    }

    private void preOrderTraverse(Node root)
    {
        log.info("PreOrder Traversal");
        if (root == null) {
            return;
        }

        Stack<Node> st = new Stack<>();

        while (true) {
            while (root != null) {
                st.push(root);
                System.out.println(root.data);

                root = root.left;
            }

            // HS: Missed this initially
            if (st.isEmpty()) {
                break;
            }

            while (!st.isEmpty()) {
                /*
                This while loop will break only when a node has
                a right child. In that case the root will be set
                as this right child. So, the while loop above will
                not have root == null in any iteration.
                 */
                Node temp = st.pop();
                if (temp.right != null) {
                    root = temp.right;
                    break;
                }else{
                    /*
                    This else is not exactly needed but good to have
                    for clarity.
                     */
                    root = null;
                }
            }
        }
    }

    private void inOrderTraverse(Node root)
    {
        log.info("InOrder Traversal");
        if (root == null) {
            return;
        }

        Stack<Node> st = new Stack<>();

        while (true) {
            while (root != null) {
                st.push(root);

                root = root.left;
            }

            // HS: Missed this initially
            if (st.isEmpty()) {
                break;
            }

            while (!st.isEmpty()) {
                /*
                This while loop will break only when a node has
                a right child. In that case the root will be set
                as this right child. So, the while loop above will
                not have root == null in any iteration.
                 */
                Node temp = st.pop();
                System.out.println(temp.data);
                if (temp.right != null) {
                    root = temp.right;
                    break;
                }else{
                    /*
                    This else is not exactly needed but good to have
                    for clarity.
                     */
                    root = null;
                }
            }
        }
    }

    private void postOrderTraverse(Node root)
    {
        log.info("PostOrder Traversal");
        if (root == null) {
            return;
        }

        Stack<Node> st = new Stack<>();

        while (true) {
            while (root != null) {
                st.push(root);

                root = root.left;
            }

            // HS: Missed this initially
            if (st.isEmpty()) {
                break;
            }

            while (!st.isEmpty()) {
                /*
                This while loop will break only when a node has
                a right child. In that case the root will be set
                as this right child. So, the while loop above will
                not have root == null in any iteration.
                 */
//                Node curr = st.pop();
                Node top = st.peek();

                if(top.right != null){
                    root = top.right;
                    break;
                }else{
                    Node popped = st.pop();
                    System.out.println(popped.data);
                    if(popped == st.peek().right){
                        popped = st.pop();
                        System.out.println(popped.data);
                    }
                }
            }
        }
    }
}
