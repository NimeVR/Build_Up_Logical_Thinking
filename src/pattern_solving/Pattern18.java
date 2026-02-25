package pattern_solving;

public class Pattern18 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			char ch=(char)(65+n-1-i);
			for(int j=0;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			for(int j=0;j<n-i+1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
