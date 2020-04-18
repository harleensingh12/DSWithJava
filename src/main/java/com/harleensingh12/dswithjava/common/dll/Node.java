package com.harleensingh12.dswithjava.common.dll;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Node
{
    int data;
    Node next;
    Node prev;
}
