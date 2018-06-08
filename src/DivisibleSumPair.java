import java.util.Scanner;
public class DivisibleSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br =new Scanner(System.in);
		int n = br.nextInt();
        int k = br.nextInt();
        int p=0;
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = br.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(((a[i]+a[j])%3)==0)
                  {
	                   p++ ;
                  }
                 
        	}
        }
        System.out.println(p);
	}

}
