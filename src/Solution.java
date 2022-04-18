import java.util.HashMap;
class Solution {
    public static void main(String [] args){
        String [] words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> myMap = new HashMap<>();
        HashMap<String ,Integer> count = new HashMap<>();
        final String [] morsAlphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        final char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                'o','p','q','r','s','t','u','v','w','x','y','z'};


        for (int i = 0; i < morsAlphabet.length; i ++){
            myMap.put(alphabet[i], morsAlphabet[i]);
        }
        for (int i = 0; i < words.length; i ++){
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < words[i].length(); j ++){
                char nextChar = words[i].charAt(j);
                temp.append(myMap.get(nextChar));
            }
            count.put(temp.toString(), 1);
        }
        return count.size();
    }
}
