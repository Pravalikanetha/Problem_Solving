package programming;

public class TwodArrays {

	public static void main(String[] args) {
		int arr[][] = {	{1,2,1,11},
						{4,1,6,12},
						{7,8,1,13}};
		int r=arr.length;
		int c=arr[0].length;
		int i=0,j=2;
		boolean istrue = true;
		int temp = arr[i][j];
		while(i<r&&j<c) {
			if(arr[i][j]!=temp) {
				istrue = false;
			}
			i++;
			j++;
		}
		System.out.print(istrue);
//		for(int i=0; i<r; i++) {
//			for(int j=c; j>=0; j--) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<r; i++) {
//			System.out.println(arr[i][2]+" ")	;
//		}
//		System.out.println();
//		for(int i=0; i<c; i++) {
//			System.out.print(arr[0][i]+" ")	;
//		}
//		System.out.println();
//		for(int i=0; i<c; i++) {
//			System.out.print(arr[i][i]+" ")	;
//		}
		
//		for(int i=0; i<r; i++) {
//			int j=c-i-1;
//			System.out.println(arr[i][j]);
//		}
	}

}
