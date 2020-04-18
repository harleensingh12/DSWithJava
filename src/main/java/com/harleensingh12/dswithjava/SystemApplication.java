package com.harleensingh12.dswithjava;

import com.harleensingh12.dswithjava.runnable.ReverseLinkedList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SystemApplication
{
    public static void main(String[] args)
    {
        log.info("Running DSWithJava");

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Thread t = new Thread(reverseLinkedList);
        t.start();
    }
}
