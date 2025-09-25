package ValidationUtil;

import java.util.regex.Pattern;

public class ValidationUtil {

    public boolean containsLowerCaseAndUpperCase(String str) {
        String pattern = "^[a-zA-Z]+$";
        return  str.matches(pattern);
    }


}
