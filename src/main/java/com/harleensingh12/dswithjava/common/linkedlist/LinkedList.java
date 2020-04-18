package com.harleensingh12.dswithjava.common.linkedlist;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@Slf4j
public class LinkedList
{
    private Node head;

    public void addNode(int data)
    {
        log.debug("Adding node: " + data);
        Node newNode = Node.builder()
                .data(data)
                .next(null)
                .build();

        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void print()
    {
        if (head == null) {
            log.error("LinkedList is empty.");
        } else {
            Node curr = head;
            while (curr != null) {
                log.info(curr.getData() + " ");
                curr = curr.getNext();
            }
        }
    }

    public void reverse()
    {
        if (head == null) {
            return;
        }

        if (head.getNext() == null) {
            return;
        }

        Node prev = null, curr = head, next = head.getNext();
        while (true) {
            curr.setNext(prev);
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.getNext();
            } else {
                head = prev;
                return;
            }
        }
    }
}
