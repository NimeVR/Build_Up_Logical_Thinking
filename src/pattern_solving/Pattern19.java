package pattern_solving;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=0;i<n;i++) {
			String star="*".repeat(n-i);
			String space=" ".repeat(i*2);
			String row=star+space+star;
			System.out.println(row);
		}
		for(int i=0;i<n;i++) {
			String star="*".repeat(i+1);
			String space=" ".repeat(((n-i)*2)-2);
			String row=star+space+star;
			System.out.println(row);
		}
	}

}
