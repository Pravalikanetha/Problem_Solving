package programming;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		String s = "abcbefgcabcbb";
		
		HashSet<Character> hs = new HashSet<>();
		int l=0;
		int max=0;
		for(int r=0; r<s.length(); r++) {
			char ch = s.charAt(r);
			if(!hs.contains(ch)) {
				hs.add(ch);
			}
			else {
				while(hs.contains(ch)) {
					hs.remove(s.charAt(l));
					l++;
				}
				hs.add(ch);
			}
			max=Math.max(r-l+1, max);
		}
		System.out.print(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		HashMap<Character, Integer> hm = new HashMap<>();
//		int count=0;
//		int l=0;
//		int max=Integer.MIN_VALUE;
//		for(int r=0; r<s.length(); r++) {
//			char ch = s.charAt(r);
//			if(hm.containsKey(ch)) {
//				hm.put(ch, hm.getOrDefault(ch,0)+1);
//			}	count++;
//			else {
//				while(!hm.containsKey(ch)) {
//					hm.remove(ch);
//					l++;
//				}			
//			max=Math.max(r-l+1, max);
//		}
//		System.out.print(max);
//		for(char c: hm.keySet()) {
//			System.out.print(c+":"+hm.get(c)+" ");	
//		}
	}
}
