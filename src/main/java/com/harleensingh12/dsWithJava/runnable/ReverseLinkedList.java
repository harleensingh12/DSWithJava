package com.harleensingh12.dsWithJava.runnable;

import com.harleensingh12.dsWithJava.common.linkedList.LinkedList;

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
//        ll.reverse2(ll.getHead());
        ll.reverseRecursive(ll.getHead());
        log.info("Print ll");
        ll.print();
        log.info("Reverse ll");
//        ll.reverse2(ll.getHead());
        ll.reverseRecursive(ll.getHead());
        log.info("Print ll");
        ll.print();
    }
}
