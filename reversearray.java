package pracc;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[] {10,20,30,40,50};
		System.out.println("The given order of array");
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	System.out.println("Array in reverse order");
			for(int j= arr.length-1;j>=0;j--) {
				System.out.print(arr[j]+ " ");
			}
		}

	}

