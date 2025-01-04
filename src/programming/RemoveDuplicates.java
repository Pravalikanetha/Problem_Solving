package programming;

public class RemoveDuplicates {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); 
//		int size = sc.nextInt();
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		int j = 0;
        for(int i=0; i<arr.length; i++) {
        		if(arr[i]!=arr[j]) {
        			arr[++j]=arr[i];
        		}
        }
        System.out.print(j+1);

	}

}
