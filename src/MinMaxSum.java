import java.util.Scanner;
public class MinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,first,temp;
		int minsum=0,maxsum=0;
		Scanner br = new Scanner(System.in);
		System.out.println("Enter the five integer : ");
		int[] arr = new int[5];
		for(i=0;i<5;i++)
		{
			arr[i] = br.nextInt();
		}
		int[] arr1 = new int[5];
		for(i=(arr.length-1);i>0;i--)
		{
			first=0;
			for(j=1;j<=i;j++)
			{
				if(arr[j]<arr[first])
					first=j;
			}
			temp=arr[first];
			arr[first] = arr[i];
			arr[i]=temp;
		}
		for(i=0;i<arr.length-1;i++)
		{
			minsum+=arr[i];
		}
		for(i=0;i<arr.length;i++)
		{
			if(i==0)
				continue;
			maxsum+=arr[i];
		}
		System.out.println(maxsum + " " +minsum);
	}

}
