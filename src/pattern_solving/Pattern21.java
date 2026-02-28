package pattern_solving;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<=n+1;i++) {
			if(i==0 || i==n+1) {
				String row="*".repeat(n-1);
				System.out.println(row);
			}else if(i%2==0) {
				System.out.println("*  *");
			}else {
				System.out.println("    ");
			}
		}
	}

}
