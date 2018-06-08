import java.util.regex.*;
import java.util.Scanner;
public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br = new Scanner(System.in);
		String str = br.nextLine();
		int p = 0;
		String[] s = str.split("(?<=[a-z])(?=[A-Z])");
		for(String k:s)
		{
			//System.out.println(k);
			p=p+1;
		}
		System.out.println(p);
	}

}
