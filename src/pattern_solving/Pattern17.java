package pattern_solving;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			char count='A';
			
			for(int j=0;j<(i*2+1);j++) {
				System.out.print(count);
				if(j<(i*2+1)/2) {
					count++;
				}else {
					count--;
				}
				
			}
			for(int j=0;j<(n/2)-i+1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
