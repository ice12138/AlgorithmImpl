package org.ice.Chapter01;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author ice12138
 * @version 1.0
 * @date 2020/9/26 19:12
 */
public class c1_1_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
    }
    @Test
    public void test(){

        System.out.println(Math.abs(-2147483648)==-2147483648);
        System.out.println(-14%3);
        System.out.println(14%-3);
    }
}
