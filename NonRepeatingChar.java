// First non-repeating char.
/*
class NonRepeatingChar{
    public static void main(){
        String a = "aabbcd";

    }

}     */


public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabbcd";
        System.out.println(firstNonRepeatingChar(str));
    }

    public static char firstNonRepeatingChar(String str) {
        int[] freq = new int[26];

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : str.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }

        return '_'; // No non-repeating char
    }
}
