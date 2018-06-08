import java.util.regex.*;
import java.util.Scanner;
public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br = new Scanner(System.in);
		String str = br.nextLine();
		int p = 0;
		String l="SOS";
		int m=str.length();
		if(m%3==0)
		{
		String[] s = str.split("(?<=\\G...)");
		for(String k:s)
		{
			//System.out.println(k);

			if(!(k.equals(l)))
			{
				p=p+1;
			}
		}
		System.out.println(p);
		}
		else
		{
			System.out.println("Wrong input");
		}
	}

}
