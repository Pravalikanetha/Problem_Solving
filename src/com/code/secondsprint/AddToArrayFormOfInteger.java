package com.code.secondsprint;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
	public static List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> list = new ArrayList<>();
		StringBuilder number = new StringBuilder();
		for (int i = 0; i < num.length; i++) {
			number.append(num[i]);
		}
		BigInteger bignumber = new BigInteger(number.toString());
        bignumber = bignumber.add(BigInteger.valueOf(k));

        List<Integer> result = new ArrayList<>();
        for (char c : number.toString().toCharArray()) {
            result.add(c - '0'); 
        }
        return result;
	}
	public static void main(String[] args) {
		int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
		int k = 516;
		System.out.println(addToArrayForm(num, k));
	}
}
