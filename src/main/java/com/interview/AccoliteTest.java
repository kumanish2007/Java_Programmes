package org.example;

import java.util.Arrays;

//Move zeroes
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
public class AccoliteTest {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveAllZerosToEnd(nums);
        System.out.println(Arrays.toString(nums));
        String st  = "a1bcd11cj2";
        decodeStringValue(st);
    }

    private static void moveAllZerosToEnd(int[] nums) {
        int temp =0;
        for(int i = 0;i < nums.length;i++){
             if(nums[i] != 0){
                 int a = nums[i];
                 nums[i] = nums[temp];
                 nums[temp] = a;
                 temp++;
             }
        }
    }

    private static void decodeStringValue(String st) {
        char[] ch = st.toCharArray();
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        for(int i = 0;i < ch.length;i++){
            if(Character.isDigit(ch[i])){
                sb.append(ch[i]);
            }else{
                sb1.append(ch[i]);
            }
        }
        System.out.println(sb.toString());
        System.out.println(sb1.toString());
    }

}

//Input  a1bcd11cj2:
//output abcdbcdbcdbcdbcdbcdbcdbcdbcdbcdbcdcjcj




