import java.util.Scanner;
public class AppleOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int app = 0;
        int i;
        int org = 0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        for(i=0;i<apple.length;i++)
        {
        	int d = apple[i] + a;
        	if((d>=s) && (d<=t)) 
        	{
        		app+=1;
        	}
        }
        for(i=0;i<orange.length;i++)
        {
        	int d = orange[i] + b;
        	if((d>=s) && (d<=t)) 
        	{
        		org+=1;
        	}
        }
        System.out.println(app);
        System.out.println(org);

		
	}

}
