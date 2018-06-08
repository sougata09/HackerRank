import java.util.Scanner;
public class BreakingTheRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 int high =0;
		 int low=0;
	        int[] score = new int[n];
	        for(int score_i=0; score_i < n; score_i++){
	            score[score_i] = in.nextInt();
	        }
	        int x=score[0];
	        for(int i=0;i<n;i++)
	        {
	        	if(score[i]>x)
	        	{
	        		high++;
	        		x=score[i];
	        	}
	        }
	        int y=score[0];
	        for(int i=0;i<n;i++)
	        {
	        	if(score[i]<y)
	        	{
	        		low++;
	        		y=score[i];
	        	}
	        }
	       
	        System.out.println(high + " " + low);
	}

}
