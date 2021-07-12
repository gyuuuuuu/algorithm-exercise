package com.gy.list;

import java.util.ArrayList;
import java.util.HashMap;

public class ClimbingStairs {
    private final HashMap<Integer, Integer> map = new HashMap();

    public int climbStairs(int n) {
        return climb(n);
    }

    // 递归
    int climb(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        if (map.containsKey(n))
            return map.get(n);
        int res = climb(n-1) + climb(n-2);
        map.put(n, res);
        return res;
    }

    // f(1) = 1
    // f(2) = 2
    // f(3) = f(1) + f(2)
    // ....
    // 斐波那契数列
    int climbV2(int n) {
        final ArrayList<Integer> arrays = new ArrayList(n-1);
        arrays.add(0, 1);
        arrays.add(1, 2);
        for (int i = 2; i < n; i++) {
            arrays.add(i, arrays.get(i-1) + arrays.get(i-2));
        }
        return arrays.get(n-1);
    }

    int climbV3(int n) {
        int a = 1;
        int b = 2;
        for (int i = 2; i < n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

}

class TestClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs c = new ClimbingStairs();
        System.out.println(c.climbStairs(47));
        System.out.println(c.climbV2(47));
        System.out.println(c.climbV3(47));
    }
}