package org.ice.Chapter01;

import org.junit.jupiter.api.Test;

/**
 * @author ice12138
 * @version 1.0
 * @date 2020/9/26 17:38
 * 二分查找
 */
public class c1_1_10 {
    public static int rank(int key,int[]a){
        return rank(key,a,0,a.length-1);
    }

    private static int rank(int key, int[] a, int left, int right) {
        if(left>right) return -1;
        int mid = left+(right-left)/2;
        if (key>a[mid]){
            return rank(key, a, mid, right);
        }else if (key<a[mid]){
            return rank(key, a, left, mid);
        }else return mid;
    }

    @Test
    public void test(){
        int a[]= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(rank(5,a));
    }
}
