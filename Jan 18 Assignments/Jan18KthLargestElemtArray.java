public class Jan18KthLargestElemtArray {
	
	public static void main(String[] args) {
		
		int[] a = {6,8,1,2,7,4};
		int k = 2;
		Arrays.sort(a);
		System.out.println(a[a.length-k]);

	}

}