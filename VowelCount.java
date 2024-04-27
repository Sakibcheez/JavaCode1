
package lab6;


public class VowelCount {
    
     public static void main(String[] args) {
        String sentence = "Hello, how are you Sakib?";
        System.out.println("Number of vowels: " + countVowels(sentence));
    }

    public static int countVowels(String sentence) {
        int count = 0;
        // Convert the sentence to lowercase to simplify counting
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    
}
