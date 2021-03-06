/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.algorithm.math;

/**
 * _553_Optimal_Division
 *
 * @author xuhaoran01
 */
public class _553_Optimal_Division {

    public String optimalDivision(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        } else if (nums.length == 1) {
            return nums[0] + "";
        } else if (nums.length == 2) {
            return nums[0] + "/" + nums[1];
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(nums[0]).append("/(");
            for (int i = 1; i < nums.length - 1; i++) {
                sb.append(nums[i]).append('/');
            }
            sb.append(nums[nums.length - 1]).append(')');

            return sb.toString();
        }
    }
}
