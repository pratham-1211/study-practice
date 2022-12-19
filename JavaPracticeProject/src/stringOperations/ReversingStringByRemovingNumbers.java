//IP : 123java456
//OP: avaj

package stringOperations;

import java.util.Scanner;

public class ReversingStringByRemovingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String tmp ="";
		for (int i = (str.length() - 1); i >= 0; i--) {
			//comparing ASCII value
			//& removing numbers from string
			if (str.codePointAt(i) >= 0 && str.codePointAt(i) <= 57) {
				continue;
			}
			//reversing String
			tmp = tmp + str.charAt(i);
		}
		System.out.println(tmp);
		sc.close();
	}

}