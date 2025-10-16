package Lab4;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Write an application that allows the user to open a file if they enter the
 * correct password. They should only have 3 attempts to enter a password
 * before it locks them out for 30 seconds. Each time they make 3 incorrect
 * attempts it should increase the lockout time by a factor of 2 (i.e. 30 seconds,
 * 60 seconds, 120 seconds, etc.).
 * - The password can be stored in plaintext in your code.
 * - Put some text in the file.
 */

public class Authentication {

    private final String password;
    private final File file;
    private int attempts = 3;
    private int lockoutTime = 30;
    private boolean locked = true;

    public Authentication(String password, File file) {
        this.password = password;
        this.file = file;
    }

    public int getAttempts() {
        return attempts;
    }

    public File getFile() {
        return file;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean verifyPassword(String password) {
        if (this.attempts > 0) {
            if (password.equals(this.password)) {
                this.locked = false;
                return true;
            } else  {
                if(this.attempts != 3) {
                    this.lockoutTime *=2;
                }

                this.attempts--;

                if (this.attempts != 0) {
                    callTimeout();
                }

                return false;
            }
        }
        return false;
    }

    private void callTimeout() {
        try {
            TimeUnit.SECONDS.sleep(this.lockoutTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
