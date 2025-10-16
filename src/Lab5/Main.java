package Lab5;

public class Main {

    public static void main(String[] args) {
        CaeserCipher cipher = new CaeserCipher();

        System.out.println("Attack at dawn = " + cipher.encrypt("Attack at dawn", 5));
        System.out.println("exxego ex hear = " + cipher.decrypt("exxego ex hear", 4));
        System.out.println("retreat = " + cipher.encrypt("retreat", 3));
    }
}
