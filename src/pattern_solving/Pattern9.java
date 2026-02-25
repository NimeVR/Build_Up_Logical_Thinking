package pattern_solving;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=5;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=n-2-i;j++) {
			System.out.print(" ");
		}
		for(int j=0;j<((i+1)*2)-1;j++)
		{
			System.out.print("*");
		}
		for(int j=0;j<=n-2-i;j++) {
			System.out.print(" ");
		}
		System.out.println();
	}
	
	for(int i=n;i>0;i--)
	{ 
			String spaces=" ".repeat(n-i);
			String star="*".repeat(i*2-1);
			String bottom=spaces+star+spaces;
		    System.out.println(bottom);
	}
	
	}

}
