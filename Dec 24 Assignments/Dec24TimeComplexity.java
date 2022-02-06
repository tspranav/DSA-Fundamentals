public class Dec24timecomplexity {

    public static void main(String[] args) {
   
       
        int n = 8;
        // TimeComplexity O(n)
        for (int i = 0; i < n; i++) {
            System.out.println("Pranav");
        }

        int i, j;

        // TimeComplexity O(n^2)
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.println("GeeksforGeeks");
            }
        }
		
        int m = 5;
        // TimeComplexity O(nlogN)
        for (i = 1; i <= m; i++) {
            for (j = 1; j <= Math.log(i); j++) {
                System.out.println("T S Pranav");
            }
        }
		
        // TimeComplexity (logN)
        int s = 5;
        for (i = 1; i < s; i *= 2) {
            System.out.println("Pranav");
        }
    }
}