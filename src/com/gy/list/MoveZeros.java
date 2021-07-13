package com.gy.list;

import java.util.Arrays;

public class MoveZeros {
    public int[] moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == 0) {
                    int temp = nums[j];
                    nums[j] = 0;
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}

class TestMoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(Arrays.stream(new MoveZeros().moveZeroes(nums)).toArray()));
    }
}
