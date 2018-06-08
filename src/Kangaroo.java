import java.util.Scanner;
public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br = new Scanner(System.in);
		int d1,d2;
		int n=1;
		int flag =0;
		int x1 = br.nextInt();
        int v1 = br.nextInt();
        int x2 = br.nextInt();
        int v2 = br.nextInt();
        d2=x2;d1=x1;
        if(((x2>x1) && (v2>v1)) || ((x1>x2) && (v1>v2)))
        		{
        	     System.out.println("NO");
        		}
        else
        {
        	while(n>0)
        	{
        		d1+=v1;
        		d2+=v2;
        		if(d1==d2)
        		{
        			System.out.println("YES");
        			break;
        		}
        		if(n==10000)
        		{
        			 flag=1;
        			break;
        		}
        		n++;
        	}
        	if(flag==1)
        	{
        		System.out.println("NO");
        	}
        }
	}

}
