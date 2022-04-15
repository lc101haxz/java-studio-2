package studio.lc101.class2;

import java.util.HashMap;
import java.util.Scanner;

public class CMain {
	private static final String quoteDefault =
		"If the product of two terms is zero then common sense "
		+ "says at least one of the two terms has to be zero to start "
		+ "with. So if you move all the terms over to one side, you "
		+ "can put the quadratics into a form that can be factored "
		+ "allowing that side of the equation to equal zero. Once "
		+ "you’ve done that, it’s pretty straightforward from there.";

	public static void main(String[] args) {
		System.out.printf("Hello world!\n");

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter a string to check, press enter for default string:\n");
		String ourStr = input.nextLine();
		if (ourStr == "") {
			ourStr = quoteDefault;
		}
		System.out.printf("Our string is:\n\"%s\"\n\n", ourStr);
		char[] charMap = ourStr.toCharArray();
		System.out.printf("String length is: %d characters\n", charMap.length);

		HashMap<Character, Integer> letterMap = new HashMap<>();

		for (char letter : charMap) {
			//sort into hash map here
			if (letter >= 'A' && letter <= 'Z') {
				letter += 0x20;
			}
			if (letter < 'a' || letter > 'z') {
				continue;
			}
			if (!letterMap.containsKey(letter)) {
				letterMap.put(letter, 1);
			} else {
				int count = letterMap.get(letter);
				letterMap.put(letter, count + 1);
			}
		}

		System.out.println(letterMap);
	}
}
