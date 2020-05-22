package com.harleensingh12.dsWithJava.common.binaryTree;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BinaryTree
{
    private Node root;

    public void addNode(Node refNode, NodePosition position, int data)
    {
        switch (position) {
            case LEFT:
                refNode.setLeft(Node.builder().data(data).build());
                break;
            case RIGHT:
                refNode.setRight(Node.builder().data(data).build());
                break;
        }
    }

    public enum NodePosition
    {
        LEFT,
        RIGHT
    }
}
