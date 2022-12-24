//IP : 123java456
//OP: 123avaj456

package stringOperations;

import java.util.Scanner;

public class ReversingStringsOnly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(str.length()<1) {
			System.out.println("String is blank");
		}
		else if(str.length()==1) {
			System.out.println("reversed string is: " + str);
		}
		else {
			char charArr[] = str.toCharArray();
			//Separating character from string 
			getCharStr(charArr);
		}
		
		
		sc.close();
		System.runFinalization();
	}
	

	//Getting original string as arg
	public static void getCharStr(char[] orgStr) {
		int len = orgStr.length;
		//defining counter variable to count characters in the string
		int charCounter=0;
		//defining temporary character array to store characters
		char[] tmpCharArr= new char[len];

		// charArr="123java456"
		for (int i=0; i < len; i++) {
			if (orgStr[i] >= 'a' && orgStr[i] <= 'z' || orgStr[i] >= 'A' && orgStr[i] <= 'Z') {
				tmpCharArr[charCounter] = orgStr[i]; // tmpArr="java"
				//Incrementing counter every time a character found
				charCounter++;
			}
		}
		
		if(charCounter==0) {
			System.out.println("No character present to reserve");
			System.exit(404);
		}
		
		//reversing character sting
		rev(tmpCharArr,charCounter);
		//System.out.println(tmpCharArr);
		
		charCounter=0;
		for (int k = 0; k < len; k++) {
			if (orgStr[k] >= 'a' && orgStr[k] <= 'z' || orgStr[k] >= 'A' && orgStr[k] <= 'Z') {
				orgStr[k] = tmpCharArr[charCounter];
				charCounter++;
			}
		}
		
		String revStr = new String(orgStr);
		System.out.println("reversed string is: " + revStr);

	}

	public static void rev(char[] cs,int c) {
		//System.out.println("Character Array length: "+c);
		// reversing tmpArr char array
		for (int j = 0; j < c / 2; j++) {
			char tmp = cs[j];
			cs[j] = cs[c - 1 - j];
			cs[c - 1 - j] = tmp;
		}
	}
}