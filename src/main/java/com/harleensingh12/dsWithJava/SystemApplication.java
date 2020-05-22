package com.harleensingh12.dsWithJava;

import com.harleensingh12.dsWithJava.runnable.binaryTree.IterativeTraversals;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SystemApplication
{
    public static void main(String[] args)
    {
        SystemApplication systemApplication = new SystemApplication();
        systemApplication.run();
    }

    private void run()
    {
        log.info("Running DSWithJava");

//        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
//        Thread t = new Thread(reverseLinkedList);
//        t.start();

//        PrintAllStringsOfLengthKFromGivenStringChars run = new PrintAllStringsOfLengthKFromGivenStringChars();
//        Thread t = new Thread(run);
//        t.start();

        IterativeTraversals iterativeTraversals = new IterativeTraversals();
        Thread t = new Thread(iterativeTraversals);
        t.start();
    }
}
