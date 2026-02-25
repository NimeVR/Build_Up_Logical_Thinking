package pattern_solving;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(++count);
			}
			for(int j=0;j<((n*2)-((i+1)*2));j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(count--);
			}
			System.out.println();
		}
	}

}
