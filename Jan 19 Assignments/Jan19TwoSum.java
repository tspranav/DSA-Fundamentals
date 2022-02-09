public class Jan19TwoSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i =0;i<n;i++) {
			a[i] =sc.nextInt();
		}
		if (a == null || a.length == 0)
            System.out.println("0");
		
        int s = 0;
        int e = a.length - 1;
        while (s < e) {
            int x = a[s] + a[e];
            if (x < t) {
                s++;
            } else if (x > t) {
                e--;
            } 
            else {
            	System.out.println(a[s]+" "+a[e]);
            	s++;
            	e--;
            	//break;
            }
        }
		

	}

}
