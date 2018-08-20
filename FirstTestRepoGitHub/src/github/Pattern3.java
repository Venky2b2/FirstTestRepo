package github;

public class Pattern3 {
	
	/* this class is to print the numbers in the below pattern based on value of a (limit)
	 * 1
	 * 1 2
	 * 1 2 3
	 * 1 2 3 4
	 * 1 2 3 4 5
	 * 1 2 3 4
	 * 1 2 3
	 * 1 2
	 * 1
	 */

	public static void main(String[] args) {
		
		int a=5, i, j, k;
		for(i=1;i<=a;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
		System.out.println();
		}
		if(i>=a) {
			while(a>=1) {
				k=1;
				for(j=a-1;j>=1;j--) {
					System.out.print(k+" ");
					k++;
				}
			System.out.println();
			a--;
			}
		}
	}
}
