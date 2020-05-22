package com.harleensingh12.dsWithJava.runnable;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintAllStringsOfLengthKFromGivenStringChars implements Runnable
{
    @Override
    public void run()
    {
        String str = "xyz";
        String res = "";
        int k = 2;

        int[] isUsed = new int[str.length()];

        log.info("HS: Calling printAllString");

        printAllString(str, res, isUsed, k);
    }

    private void printAllString(String str, String res, int[] isUsed, int k)
    {
        if (str == null || str.length() == 0 || str.length() < k) {
            return;
        }

        List<Character> charOptions = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (isUsed[i] == 0) {
                charOptions.add(str.charAt(i));
            }
        }

        if(charOptions.size() == 0){
            return;
        }

        for (int i = 0; i < charOptions.size(); i++) {
            res = res + charOptions.get(i);

            if (res.length() == k) {
                log.info(res);
            } else {
                isUsed[i] = 1;
                printAllString(str, res, isUsed, k - 1);
            }

            isUsed[i] = 0;
        }
    }
}
