import java.util.Scanner;
public class MaxMinSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,max=0,min=0;
		Scanner br = new Scanner(System.in);
		System.out.println("Enter the five integer : ");
		int[] arr = new int[5];
		long total=0;
		for(i=0;i<5;i++)
		{
			arr[i] = br.nextInt();
			total+=arr[i];
		}
		for(i=0;i<5;i++)
		{
			if(arr[i]>arr[max])
				max=i;
			if(arr[i]<arr[min])
				min=i;
		}
		
		System.out.println((total-arr[max]) + " " +(total-arr[min]));
	}

}
