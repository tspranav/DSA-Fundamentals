public class Jan19JewelsAndStones {

	public static void main(String[] args) {
		
		
		String jewels ="aA";
		String stones = "aAAbbbbaAbc";
		int count =0;
		for(int i=0;i<stones.length();i++) {
			String c = ""+ stones.charAt(i);
			if(jewels.contains(c)) {
				count++;
			}
		}
		System.out.println(count);

	}

}