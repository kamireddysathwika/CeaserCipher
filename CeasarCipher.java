public class CeasarCipher {
public static void main(String[] args) {
        String text = "HELLO WORLD";
        int shift = 3; 
        String encryptedText = encrypt(text, shift);
        System.out.println("Original Text: " + text);
        System.out.println("Encrypted Text: " + encryptedText);
    }
    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
                char shiftedChar = (char) ((currentChar - base + shift) % 26 + base);
                encryptedText.append(shiftedChar);
            } else {
                encryptedText.append(currentChar);
            }
        }
         return encryptedText.toString();
    }
}

