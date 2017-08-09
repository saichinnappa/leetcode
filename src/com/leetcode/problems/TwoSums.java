package com.leetcode.problems;

/*
  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */

public class TwoSums {

  public static void main(String args[]){

    if(args.length != 2){
      System.out.println("Invalid arguments! Must be exactly two arguments.");
    }

    if(args[0].length() < 2){
      System.out.println("Input array must have atleast two elements");
    }
    System.out.println(args[0].length());
    int[] inputArray = new int[args[0].length()];

//    for(String inputElement : args[0]){
//    }


  }

}
