package programming;

public class BestTimeToBuyAndSell {
	static int maxProfit(int[] arr) {
		int minSofar = arr[0];
		int ans=0;
		for(int i = 1 ; i<arr.length; i++) {
			int profit = arr[i]-minSofar;
			if(profit>ans) {
				ans=profit;
			}
			minSofar = Math.min(arr[i], minSofar);
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,8,4};
		int profit=maxProfit(arr);
		System.out.print(profit);
	}

}
