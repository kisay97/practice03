package prob3;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
		if(str != null){
			char rev[] = new char[str.length()];
			for(int i=0; i<rev.length; i++){
				rev[i] = str.charAt(str.length()-1-i);
			}
			return rev;
		}
		return null;
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		for (char c : array) {
			System.out.print(c);
		}
		System.out.println();
	}
}
