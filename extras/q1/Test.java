import java.util.HashMap;

public class Test{

     public static void main(String []args){
        System.out.println("Hello World");
        String str = "Hello World";
        str = str.replaceAll("\\s","");
         HashMap<Character, Integer> map = new HashMap<Character, Integer>();

         for(int i =0; i < str.length(); i++){
             if( map.containsKey(str.charAt(i)) ){
                 map.put(str.charAt(i), map.get(str.charAt(i))+1);
             }else{
                 map.put(str.charAt(i),1);
             }
         }

         map.forEach((key, value)-> System.out.println(key + " --> "+ value));
     }
}