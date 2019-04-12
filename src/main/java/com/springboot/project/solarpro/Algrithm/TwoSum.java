package com.springboot.project.solarpro.Algrithm;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length; i++){
            int x = nums[i];
            int y = target - x;
            for(int j = i+1;j<nums.length; j++){
                if(nums[j] == y){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public boolean isValid(String s) {
        Map<Character,Character> paramap = new HashMap<Character,Character>();
        paramap.put(')','(');
        paramap.put(']','[');
        paramap.put('}','{');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(paramap.containsKey(c)){
                char sch = stack.isEmpty()?'#':stack.pop();
                if(sch != paramap.get(c)){
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    /*public int trap(int[] height) {
        int count = 0;
        int index =0;
        int k=0;
        for(int i =0;i<height.length;i++){
            if(k>=height.length){
                break;
            }
            int a = 0;
            if(k==index &&(k!=0)){
                a=height[k+1];
            }else {
                a=height[index];
            }

            k = index;
            for(int j =k+1;j<height.length;j++){
                int b = height[j];

                if(a>b){
                    count += (a-b);
                }else{
                    index = j;
                   break;
                }
            }
        }
        return count;
    }*/
    public int trap(int[] height) {
        if (height.length == 0) return 0;
        int left = 0;
        int right = height.length - 1;
        int area = 0, leftHeight = height[0], rightHeight = height[height.length - 1];
        while (left < right){
            if (height[left] < height[right]){
                left++;
                // if (leftHeight < height[left]){
                //     leftHeight = height[left];
                // }
                // else{
                //     area += leftHeight - height[left];
                // }
                leftHeight = Math.max(leftHeight, height[left]);
                area += leftHeight - height[left];
            }
            else{
                right--;
                // if (rightHeight < height[right]){
                //     rightHeight = height[right];
                // }
                // else{
                //     area += rightHeight - height[right];
                // }
                rightHeight = Math.max(rightHeight, height[right]);
                area += rightHeight - height[right];
            }
        }
        return area;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3,3,4},6);
        int[] result1 = twoSum.twoSum1(new int[]{3,3,4},6);
        System.out.println(JSON.toJSON(result));
        System.out.println(JSON.toJSON(result1));

        int h[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int count = twoSum.trap(h);
        System.out.println(count);
    }
}
