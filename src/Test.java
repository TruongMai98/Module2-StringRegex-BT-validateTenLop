public class Test {
    private static ClassName className;
    public static final String[] valid = new String[] {"C0318G", "A1218M"};
    public static final String[] invalid = new String[] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String a : valid) {
            boolean isValid = className.validate(a);
            System.out.println("class name: " + a + " is valid " + isValid);
        }

        for (String a : invalid) {
            boolean isValid = className.validate(a);
            System.out.println("class name: " + a + " is valid " + isValid);
        }
    }
}
