package Lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CaeserCipherTest {

    CaeserCipher cipher = new CaeserCipher();

    @Test
    void encrypt() {
        String plainText = "ATTACK AT DAWN";
        int key = 3;
        String expected = "DWWDFNDWGDZQ";
        String actual = cipher.encrypt(plainText, key, false);
        assertEquals(expected, actual);
    }

    @Test
    void decrypt() {
        String cipherText = "dahhk";
        int key = 4;
        String expected = "hello";
        String actual = cipher.encrypt(cipherText, key, true);
        assertEquals(expected, actual);
    }
}