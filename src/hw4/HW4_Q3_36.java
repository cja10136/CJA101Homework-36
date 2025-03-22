package hw4;

public class HW4_Q3_36 {
//	有個字串陣列如下(八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
	public static void main(String[] args) {
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		boolean isVowel;
		int countVowel = 0;
		for (int i=0 ; i < planets.length; i++) {
			for (int j = 0; j < planets[i].length(); j++) {
				isVowel = IsVowel(planets[i].charAt(j));
				if (isVowel)
					countVowel++;
			}
		}
		System.out.printf("這陣列裡面共有%d個母音\n", countVowel);
	}
	public static boolean IsVowel(char c) {
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for (int k = 0; k < 5; k++)
			if(c == vowels[k])
				return true;
		return false;
	}
}
