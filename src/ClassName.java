import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASS_NAME = "^[CAP]\\d{4}[GHIKLM]$";

    public ClassName() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
