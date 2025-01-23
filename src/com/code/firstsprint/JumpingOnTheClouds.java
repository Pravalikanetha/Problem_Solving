package com.code.firstsprint;

import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {
	public static int jumpingOnClouds(List<Integer> c) {
		int totalcount = 0 ; 
		int n = c.size();
		int i=0;
		while(i< c.size()-1) {
			if(i+2< n && c.get(i+2)==0) {
				i+=2;
			}else {
				i+=1;
			}
			totalcount++;
		}
		
		return totalcount;
	}
	public static void main(String[] args) {
//		List<Integer> a = Arrays.asList( 0, 0, 1,0,0,1,0); //4
//		List<Integer> b = Arrays.asList( 0, 0, 0,1,0); //2
//		List<Integer> c = Arrays.asList( 0, 1, 0,0,0,1,0); //3
//		List<Integer> d = Arrays.asList( 0, 1, 0,0,1,0); //3
//		List<Integer> e = Arrays.asList( 0, 0, 0,0,1,0,0); //4
		List<Integer> f = Arrays.asList(0, 0, 0, 1, 0, 0); //3
		System.out.println(jumpingOnClouds(f));
	}
}
