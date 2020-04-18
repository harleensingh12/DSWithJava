package com.harleensingh12.dswithjava.common.linkedlist;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Node
{
    int data;
    Node next;
}
