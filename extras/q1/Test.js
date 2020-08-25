/**
 * 
 * In a Given String Find the number of occurences of each char
 * eg. in String "Hello World"
 * output should be : h --> 1
 * e --> 1
 * l --> 3
 * o --> 2
 * and so on
 */

var str = 'Hello World';

var lower_str = str.toLowerCase().replace(' ', '');

var words = new Map();

for (var i = 0; i < str.length; i++){
	if (words.has(lower_str.charAt(i))) {
		words.set(lower_str.charAt(i), words.get(lower_str.charAt(i)) + 1);
	} else {
		words.set(lower_str.charAt(i), 1);
	}
}


console.log(words);
