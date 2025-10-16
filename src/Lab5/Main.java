package Lab5;

public class Main {

    public static void main(String[] args) {
        CaeserCipher cipher = new CaeserCipher();

        System.out.println("Attack at down = " + cipher.encrypt("Attack at down", 5));
        System.out.println("exxego ex hsar = " + cipher.decrypt("exxego ex hsar", 4));
        System.out.println("retreat = " + cipher.encrypt("retreat", 3));
    }
}
