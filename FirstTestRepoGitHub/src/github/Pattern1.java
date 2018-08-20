package github;

public class Pattern1 {

	/* this class is to print the numbers in the below pattern based on value of a (limit)
	 * *
	 * * *
	 * * * *
	 * * * * *
	 * * * * * * ----- anything like this and in the reverse order in the below
	 */
	public static void main(String[] args) {
		
		int a=5, i, j;		
		
		for (i=1;i<=a;i++) {
			for (j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		if(i>=a) {
			while(i>=1) {
				for(j=a-1;j>=1;j--)
					System.out.print("* ");
				System.out.println();
				i--;
				a--;
			}
		}
	}
}
