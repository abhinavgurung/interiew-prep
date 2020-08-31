

/*
Implement am algorithm to determine if a string has all unique characters. what it you cannot use additional data structure

*/
import java.util.Scanner;
public class Test{

	public static void main(String[] args){
		System.out.print("Enter a String: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		isUnique(input);
	}

	public static void isUnique(String str){

		for(int i = 0; i < str.length(); i++){
			for (int j = i+1; j < str.length(); j++){
				if( str.charAt(i) == (str.charAt(j)) ){
					System.out.println("The characters in String "+ str +" is not Unique");
					return;
				}
			}
		}

		System.out.println("The characters in String "+ str+ " is Unique");
	}
}


/*
		NOTES

		The time complexity is O(n2) since we have 2 for loops running. 

*/