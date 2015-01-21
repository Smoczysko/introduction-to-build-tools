package pl.org.dragonia.buildtools.ant.include;

public class AppUtils {
    public static String concatenateArguments(String[] args) {
        String concatenatedArgs = "";

        for (String arg : args) {
            concatenatedArgs += arg + "-";
        }

        if (args.length > 0) {
            concatenatedArgs = concatenatedArgs.substring(0, concatenatedArgs.length() - 1);
        }

        return concatenatedArgs;
    }
}
