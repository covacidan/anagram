import java.util.HashMap;

public class Anagram {

    public static String compareWords(String first, String last){

        // compare if given words are equal strings
        if(first.equals(last))
            return "Words "+ first + " and "+ last +" are exact match!";

        // splitting the strings into chars and updating the hashmaps
        HashMap<Character, Integer> map1 = mapStrings(first);
        HashMap<Character, Integer> map2 = mapStrings(last);

        if(map1.equals(map2))
            return "Words "+ first + " and "+ last +" are anagram!";

        return "Words "+first + " and "+last +" are NOT anagram!";
    }

    public static HashMap<Character, Integer> mapStrings(String word){

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        //creating an array of chars
        char array[] = word.toCharArray();

        //parsing the array and putting/updating the chars in hashmap
        for(int i=0; i<array.length; i++){

            if(map.get(array[i]) ==  null)
                //if new char is encountered, it is inserted with count = 1
                map.put(array[i], 1);
            else
                //updating the value of index array[i]
                map.put(array[i], map.get(array[i])+1);
        }

        return map;
    }

    public static void main(String [] args){
        String string1 = "night";
        String string2 = "thing";
        String string3 = "testa";
        String string4 = "testb";
        String string5 = "whatever";

        System.out.println(compareWords(string1, string2));
        System.out.println(compareWords(string3, string4));
        System.out.println(compareWords(string5, string5));
    }
}
