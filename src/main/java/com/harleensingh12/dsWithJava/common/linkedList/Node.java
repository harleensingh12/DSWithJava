package com.harleensingh12.dsWithJava.common.linkedList;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Node
{
    private int data;
    private Node next;
}
