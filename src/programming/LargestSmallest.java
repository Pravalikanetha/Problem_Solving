package programming;

public class LargestSmallest {

	public static void main(String[] args) {
		int a[] = {1, 3, 4, 10, 1, 8, 4};
		int largest = a[0];
		int smallest = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i] >= largest) {
				largest = a[i];
			}
			if(a[i] <= smallest) {
				smallest = a[i];
			}
		}
		System.out.println("largest number is " + largest);
		System.out.print("largest number is " + smallest);
		
	}

}
