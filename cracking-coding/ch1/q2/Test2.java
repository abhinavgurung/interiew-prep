/*
	Given two String find if one is the permutation of another

	using sort method
*/

import java.util.Scanner;
import java.util.Arrays;

public class Test2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first String: ");
		String str1 = input.next();

		System.out.print("Enter second String: ");
		String str2 = input.next();
		boolean permutation = isPermutation(str1, str2);
		if(permutation){
			System.out.println("They are permutation");
		}else{
			System.out.println("Not permutation");
		}

	}

	public static String sort(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public static boolean isPermutation(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}

		return sort(s1).equals(sort(s2));
	}
}

