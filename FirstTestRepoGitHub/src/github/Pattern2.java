package github;

public class Pattern2 {

	/* this class is to print the numbers in the below pattern based on value of a (limit)
	 * 1
	 * 1 2
	 * 1 2 3
	 * 1 2 3 4
	 * 1 2 3 4 5 ----- anything like this
	 */
	public static void main(String[] args) {
		
		int a=5, i, j, k=1;
		for (i=1;i<=a;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
