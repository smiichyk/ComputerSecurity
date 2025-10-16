package Lab5;

public class Main {

    public static void main(String[] args) {
        CaeserCipher cipher = new CaeserCipher();

        System.out.println("Attack at dawn = " + cipher.encrypt("Attack at dawn", 5, false));
        System.out.println("ATTACK AT DAWN = " + cipher.encrypt("ATTACK AT DAWN", 3, true));
        System.out.println("DWWDFN DW GDZQ = " + cipher.decrypt("DWWDFN DW GDZQ", 3, true));
        System.out.println("retreat = " + cipher.encrypt("retreat", 3, false));
    }
}
