import java.util.Scanner;
public class GradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = br.nextInt();
		int p=0;
		int[] arr = new int[n];
		System.out.println("Enter the grades : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = br.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i] > 37)
			{
				 p =arr[i]/5;
				p=p+1;
				if((p*5)-arr[i] < 3)
				{
					arr[i] = p*5;
					System.out.println(arr[i]);
				}
				else{
				System.out.println(arr[i]);
				}
			}
			else{
			System.out.println(arr[i]);
			}
		}
	}

}
