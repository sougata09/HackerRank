import java.util.Scanner;
public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br = new Scanner(System.in);
		int zero=0,minus=0,plus=0;
		System.out.println("Enter the number element : ");
		int n = br.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = br.nextInt();
		}
		for(int k=0;k<n;k++)
		{
			if(arr[k]>0)
				plus+=1;
			else if(arr[k]<0)
				minus+=1;
			else
				zero+=1;
			
		}
		System.out.println((float)plus/(float)n);
		System.out.println((float)minus/(float)n);
		System.out.println((float)zero/(float)n);
	}

}
