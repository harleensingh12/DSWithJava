package com.harleensingh12.dsWithJava.common.linkedList;

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

    public void reverse2(Node head)
    {
        if (head == null) {
            return;
        }

        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.getNext();

            curr.setNext(prev);

            prev = curr;
            curr = next;
        }

        this.head = prev;
    }

    public void reverseRecursive(Node head)
    {
        if (head == null) {
            return;
        } else {
            this.head = reverseRecursiveUtil(head);
        }
    }

    private Node reverseRecursiveUtil(Node head)
    {
        if (head == null || head.getNext() == null) {
            return head;
        } else {
            Node newHead = reverseRecursiveUtil(head.getNext());

            Node prevHeadNext = head.getNext();
            head.setNext(null);
            prevHeadNext.setNext(head);

            return newHead;
        }
    }
}
