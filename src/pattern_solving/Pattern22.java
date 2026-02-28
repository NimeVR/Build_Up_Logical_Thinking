package pattern_solving;

import java.util.*;
public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int top=0,right=0,left=0,bottom=0,value=0,mini=0;
		for(int i=0;i<=(2*n)-2;i++) {
			for(int j=0;j<=(2*n)-2;j++) {
				top=i;
				bottom=j;
				left=(2*n-2)-i;
				right=(2*n-2)-j;
				mini=Math.min(Math.min(top, bottom),Math.min(right,left));
				value=n-mini;
				System.out.print(value);
			}
			System.out.println();
		}
	}

}
