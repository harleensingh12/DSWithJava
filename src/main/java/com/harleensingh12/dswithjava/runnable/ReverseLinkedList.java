package com.harleensingh12.dswithjava.runnable;

import com.harleensingh12.dswithjava.common.linkedlist.LinkedList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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

        log.info("Print ll");
        ll.print();
        log.info("Reverse ll");
        ll.reverse();
        log.info("Print ll");
        ll.print();
        log.info("Reverse ll");
        ll.reverse();
        log.info("Print ll");
        ll.print();
    }
}
