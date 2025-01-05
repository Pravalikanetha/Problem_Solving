package programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> outerList = new ArrayList<>();
		int sum = 0;
		int n = nums.length;
		HashSet<Integer> hs = new HashSet<>();
		for (int r = 0; r < n; r++) {
			sum+=nums[r];
			hs.add(nums[r]);
			if(hs.size()==3) {
				if (sum == 0) {
                    outerList.add(new ArrayList<>(hs));
                    System.out.println("outerList->" + outerList);
                }
                
                // Convert HashSet to List to remove element by index
                List<Integer> list = new ArrayList<>(hs);
                System.out.println("Before removing index 2: " + list);
                
                // Remove element at index 2
                if (list.size() > 2) {
                    list.remove(2);  // Removes the element at index 2
                }
                
                // Convert the modified List back to HashSet
                hs = new HashSet<>(list);
                System.out.println("HashSet after removal: " + hs);
			}
		}
		return outerList;
	}
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));

	}
}
