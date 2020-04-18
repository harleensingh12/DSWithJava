package com.harleensingh12.dswithjava.runnable;

import com.harleensingh12.dswithjava.common.linkedlist.LinkedList;

public class ReverseLinkedList implements Runnable
{
    @Override
    public void run()
    {
        LinkedList ll = LinkedList.builder().build();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);

        ll.print();
    }
}
