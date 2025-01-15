package com.codesprint;

import java.util.HashMap;
import java.util.HashSet;

public class RepeatedNTimes {
	public static int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        int ans = 0;
        int max = 0;
        for(int i : hm.keySet()){
            int num = hm.get(i);
            if(num>max) {
            	max = num;
            	ans = i;
            }
        }
        System.out.println(hm);
        return ans;
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3,3};
		HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            if(!hs.add(num)){
                System.out.println(num);
            }
        }
        System.out.println(hs);

		System.out.println("with function->"+repeatedNTimes(nums));
	}

}
