/*
Implement am algorithm to determine if a string has all unique characters. what it you cannot use additional data structure

using array

*/

import java.util.Scanner;
public class Test2{

	public static void main(String[] args){
		System.out.print("Enter a String: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		isUnique(input);
	}

	public static void isUnique(String str){

		boolean [] array = new boolean[128];

		for(int i = 0; i < str.length() ; i ++){
			int val = str.charAt(i);
			if(array[val]){
				System.out.println("not unique");
				return;
			}else{
				array[val] = true;
			}
		}
		System.out.println("unique");
	}
}

/*
time complexity is O(n) where n is the number of chars in string. since there is only 1 for loop. 
*/