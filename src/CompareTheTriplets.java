import java.util.Scanner;
public class CompareTheTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br  = new Scanner(System.in);
    	int alice = 0,bob=0;
    	System.out.println("Enter the length: ");
    	int n = br.nextInt();
    	int[] a = new int[n];
    	int[] b = new int[n];
    	System.out.println("Enter the value for alice");
    	for(int i=0;i<n;i++)
    	{
    		a[i] = br.nextInt();
    	}
    	System.out.println("Enter the value for bob");
    	for(int i=0;i<n;i++)
    	{
    		b[i] = br.nextInt();
    	}
    	for(int i=0;i<n;i++)
    	{
    		if(a[i] > b[i])
    			alice = alice+1;
    		else if(a[i]<b[i])
    			bob=bob+1;
    		else{
    			alice=alice+0;
    		    bob=bob+0;
    		}
    	}
    	System.out.println("Alice point is : " + alice);
    	System.out.println("Bob point is : " + bob);

	}

}
