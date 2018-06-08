import java.util.Scanner;
public class BetweenTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br = new Scanner(System.in);
		 int n = br.nextInt();
		 int x=0;
		 int k=0;
		 int flag1,flag2;
	        int m = br.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = br.nextInt();
	        }
	        int[] b = new int[m];
	        for(int b_i=0; b_i < m; b_i++){
	            b[b_i] = br.nextInt();
	        }
	        for(x=a[n-1];x<=b[m-1];x++)
	        {
	        	flag1=0;
	        	flag2=0; 
	        	for(int a_i=0; a_i < n; a_i++)
	        	{
		            if((x%a[a_i]) != 0)
		            {
		            	flag1=1;
		            	//System.out.println(flag1);
		            	break;
		            }
		            	
		        }
	        	for(int b_i=0; b_i < m; b_i++)
	        	{
		            if((b[b_i]%x) != 0)
		            {
		            	flag2=1;
		            	//System.out.println(flag1);

		            	break;
		            }
		            	
		        }
	        	if((flag1==0) && (flag2==0))
	        	{
	        		k=k+1;
	        	}
	        }
	        System.out.println(k);
	}

}
