package com.harleensingh12.dsWithJava.common.binaryTree;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Node
{
    public int data;
    public Node left;
    public Node right;

    public Node(Node node)
    {
        this.data = node.data;
        this.left = node.left;
        this.right = node.right;
    }
}
