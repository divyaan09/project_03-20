import java.util.Scanner;

public class CaesarCipher {

    // Encrypt function
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                char c = (char) ((ch + shift - 'A') % 26 + 'A');
                result.append(c);
            } else if (Character.isLowerCase(ch)) {
                char c = (char) ((ch + shift - 'a') % 26 + 'a');
                result.append(c);
            } else {
                result.append(ch); // Non-alphabet characters
            }
        }

        return result.toString();
    }

    // Decrypt function
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - (shift % 26)); // Reuse encrypt with reverse shift
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        System.out.print("Enter shift (e.g., 3): ");
        int shift = sc.nextInt();

        String encrypted = encrypt(input, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
