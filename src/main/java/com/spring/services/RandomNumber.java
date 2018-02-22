package com.spring.services;

/**
 * @author : Suraj Gautam
 *         <suraj.gautam@f1soft.com>
 */
public class RandomNumber {
    public int generate() {
        int random = (int )(Math.random() * 100 + 1);
        return random;
    }
}
