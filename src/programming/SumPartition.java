package programming;

public class SumPartition {
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	static int arraySum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static boolean canSplit(int arr[]) {
        int totalSum = arraySum(arr);
        
        int prefSum=0;
        for(int i=0; i<arr.length; i++){
            prefSum+=arr[i];
            int sufixSum= totalSum -prefSum;
            if(prefSum==sufixSum){
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		int[] arr= {5, 3, 1, 6, 1, 2};
//		printArray(arr);
		System.out.print("Point is:" + canSplit(arr));
	}

}
