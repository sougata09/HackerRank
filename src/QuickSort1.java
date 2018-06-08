import java.util.Scanner;
public class QuickSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br = new Scanner(System.in);
		int n = br.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i] = br.nextInt();
		}
		int x = ar[0];
		int i=ar.length;
		for(int j=n-1;j>=0;j--)
		{
			if(ar[j]>x)
			{
			i=i-1;
			int p=ar[i];
			ar[i]=ar[j];
			ar[j]=p;
			}
		}
		int q=ar[i-1];
		//System.out.println(ar[i]);
		ar[i-1]=ar[0];
		ar[0]=q;
		for(int k=0;k<n;k++)
		{
			System.out.println(ar[k]);
		}
	}

}
