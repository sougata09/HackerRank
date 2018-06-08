import java.util.regex.*;
import java.util.Scanner;
import java.util.*;
public class Pangrams {
public static void main(String[] args) {

	 Set<Integer> alphabet = new HashSet<>(26);

    int cnt = 0;
	Scanner br = new Scanner(System.in);
	String str = br.nextLine();

    for (char c : str.toCharArray()) {
        int n = c - 'a';
        if (n >= 0 && n < 26) {
            if (alphabet.add(n)) {
                cnt += 1;
                if (cnt == 26) {
                    System.out.println("found all letters");
                    break;
                }
            }
        }
    }
}
}