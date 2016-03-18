package com.base.utils;

/**
 * Created by guoshijie on 16/3/18.
 */
public class MathUtils {

    public static void main(String[] args) {
        System.out.println(myPow(4,4));
    }

    /**
     * 求x的y次方
     * @param x
     * @param y
     * @return
     */
    public static int myPow(int x,int y){
        int res = 0;
        if(y > 0){
            res = x * myPow(x,y - 1);
        }else{
            res = 1;
        }
        return res;
    }
}
