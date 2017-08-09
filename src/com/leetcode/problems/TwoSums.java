package com.leetcode.problems;

/*
  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSums {

  public static void main(String args[]){

    int[] nums = {2, 7, 11, 15};
    ArrayList<Integer> output = new ArrayList<Integer>();

    int target = 9;
    for(int i=0; i<nums.length; i++){
      for(int j=1; j<nums.length; j++){
        if(nums[i] + nums[j] == target){
            output.add(i);
            output.add(j);
            break;
        }
      }
    }
    if(output.size() != 0){
      System.out.println(output);
    }
    else{
      System.out.println("No input found which sums up to target");
    }
  }

}
