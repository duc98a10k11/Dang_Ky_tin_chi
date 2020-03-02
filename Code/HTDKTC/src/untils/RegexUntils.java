package untils;

import java.util.regex.Pattern;

public class RegexUntils {

    public static final String PASSWORD_REGEX = "^(?=.*[A-Za-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*\\-+=_~\\]\\[\\{\\}\\<\\>;:|.,`~'%\"\\(\\)\\\\/]).{8,}$";

    public static final String USENAME_WITHOUT_ = "[A-Za-z0-9_]+";

    public static final String SPACE_REQEX = "^[.\\s]+$";

    public static boolean checkSpeceRegex(String str) {
        return Pattern.matches(SPACE_REQEX, str);
    }

    public static boolean checkSpecialCharacterWithout(String str) {
        return Pattern.compile(USENAME_WITHOUT_).matcher(str).matches();
    }

    public static boolean checkPassword(String str) {
        return Pattern.matches(PASSWORD_REGEX, str);
    }

}
