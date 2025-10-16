package Lab5;

import java.util.ArrayList;
import java.util.Arrays;

public class CaeserCipher {

    private final ArrayList<Character> alphabet = new ArrayList<>(
            Arrays.asList(
                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
            )
    );

    public String encrypt(String plainText, int key, boolean space) {
        return cryptosystem(plainText, key, 1, space);
    }

    public String decrypt(String cipherText, int key, boolean space) {
        return cryptosystem(cipherText, key, 2, space);
    }

    private String cryptosystem(String text, int key, int mod, boolean space) {
        StringBuilder characters = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            for (char c : alphabet) {
                if  (space && text.charAt(i) == ' ') {
                    characters.append(' ');
                    break;
                } else if (c == text.toLowerCase().charAt(i)) {
                    boolean isUpperCase = Character.isUpperCase(text.charAt(i));
                    int shift = (mod == 1) ? key : -key;
                    char newChar = alphabet.get(getModulo(alphabet.indexOf(c) + shift));
                    if (isUpperCase) newChar = Character.toUpperCase(newChar);
                    characters.append(newChar);
                }
            }
        }
        return characters.toString();
    }

    private int getModulo(int key) {
        int letterCount = 26;
        return Math.floorMod(key, letterCount);
    }
}
