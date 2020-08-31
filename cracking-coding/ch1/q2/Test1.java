/*
	Given two String find if one is the permutation of another
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Test1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the First String: ");
		String str1 = input.next();

		System.out.print("Enter the Second String: ");
		String str2 = input.next();

		boolean isPalindrome = checkPalindrome(str1, str2);
		if(isPalindrome){
			System.out.println("They are Palindrome");
		}else{
			System.out.println("Not palindrome");
		}

	}

	public static boolean checkPalindrome(String str1, String str2){
		ArrayList<Character> list = new ArrayList<>();
		for(char c: str1.toCharArray()){
			list.add(c);
		}

		for(char c : str2.toCharArray()){
			if( ! list.contains(c)){
				return false;
			}
		}
		return true;
	}
}

/*
The run time will be O(n2) because we have 2 for loops going over both strings from first char to last char.
*/