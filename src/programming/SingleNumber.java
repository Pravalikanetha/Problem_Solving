package programming;

public class SingleNumber {

	public static void main(String[] args) {
		int[] arr = {4,1,2,1,2}; 
		int a=0;
		 for(int i=0; i<arr.length; i++) {
			 a^=arr[i];
		 }
		 System.out.print(a);
		
		
	}

}
