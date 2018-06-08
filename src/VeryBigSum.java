import java.util.Scanner;
public class VeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br  = new Scanner(System.in);
		int n = br.nextInt();
		long sum=0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = br.nextInt();
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
