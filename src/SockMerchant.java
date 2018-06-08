import java.util.Scanner;
public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br = new Scanner(System.in);
		 int n = br.nextInt();
		 int k=0;
		 int sock=0;
	        int c[] = new int[n];
	        for(int c_i=0; c_i < n; c_i++){
	            c[c_i] = br.nextInt();
	        }
	        for (int i = 0; i < c.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < c.length; j++)
	                if (c[j] < c[index])
	                    index = j;
	      
	            int smallerNumber = c[index]; 
	            c[index] = c[i];
	            c[i] = smallerNumber;
	        }
	        while(k<(c.length-1))
	        {
	        	int l=k+1;
	        	if(c[k]==c[l])
	        	{
	        		sock+=1;
	        		k+=2;
	        	}
	        	else
	        	{
	        	k+=1;
	        	}
	        }
	        System.out.println(sock);
	}

}
