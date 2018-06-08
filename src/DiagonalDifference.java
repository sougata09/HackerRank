import java.util.Scanner;
public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br = new Scanner(System.in);
		int n = br.nextInt();
		int[][] arr =new int[n][n];
		int diag1=0,diag2=0,m=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] =br.nextInt();
			}
		}
		for(int k=0;k<n;k++)
		{
			diag1=diag1+arr[k][k];
			m=n-k-1;
			diag2 = diag2 + arr[k][m];
		}
		System.out.println(Math.abs(diag1-diag2));
	}

}
