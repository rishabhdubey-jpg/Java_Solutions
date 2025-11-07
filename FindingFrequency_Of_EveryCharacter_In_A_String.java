class FindingFrequency_Of_EveryCharacter_In_A_String {
    public static void main(String[] args) {

// --> Finding the frequency of every character found in the string..
        String str3 = "hello";
        int freq[] = new int[256];
        for (char ch : str3.toCharArray()) {
            freq[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + "-->" + freq[i]);
            }
        }
    }
}