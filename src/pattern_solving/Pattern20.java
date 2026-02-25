package pattern_solving;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
			String star="*".repeat(i+1);
			String space=" ".repeat((n-i-1)*2);
			String row=star+space+star;
			System.out.println(row);
		}
		for(int i=n-2;i>=0;i--) {
			String star="*".repeat(i+1);
			String space=" ".repeat((n-i-1)*2);
			String row=star+space+star;
			System.out.println(row);
		}
	}

}
