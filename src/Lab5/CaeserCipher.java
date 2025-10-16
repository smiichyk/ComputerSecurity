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

    public String encrypt(String plainText, int key) {
        StringBuilder characters = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            for (char c : alphabet) {
                if (plainText.charAt(i) == ' ') {
                    characters.append(' ');
                    break;
                } else if (c == plainText.toLowerCase().charAt(i)) {
                    characters.append(alphabet.get(getModulo(alphabet.indexOf(c)+(key))));
                }
            }
        }
        return characters.toString();
    }

    public String decrypt(String cipherText, int key) {
        StringBuilder characters = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            for (char c : alphabet) {
                if  (cipherText.charAt(i) == ' ') {
                    characters.append(' ');
                    break;
                } else if (c == cipherText.toLowerCase().charAt(i)) {
                    characters.append(alphabet.get(getModulo(alphabet.indexOf(c)-(key))));
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
