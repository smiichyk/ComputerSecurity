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
        return cryptosystem(plainText, key, 1);
    }

    public String decrypt(String cipherText, int key) {
        return cryptosystem(cipherText, key, 2);
    }

    private String cryptosystem(String text, int key, int mod) {
        StringBuilder characters = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            for (char c : alphabet) {
                if  (text.charAt(i) == ' ') {
                    characters.append(' ');
                    break;
                } else if (c == text.toLowerCase().charAt(i)) {
                    if (mod == 1) {
                        characters.append(alphabet.get(getModulo(alphabet.indexOf(c)+(key))));
                    } else {
                        characters.append(alphabet.get(getModulo(alphabet.indexOf(c)-(key))));
                    }
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
