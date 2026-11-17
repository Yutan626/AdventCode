import java.util.regex.*;

public class main {

    public static int solve(String input) {

        Pattern pattern = Pattern.compile(
            "mul\\(([0-9]{1,3}),([0-9]{1,3})\\)|do\\(\\)|don't\\(\\)"
        );

        Matcher matcher = pattern.matcher(input);

        boolean enabled = true;
        int sum = 0;

        while (matcher.find()) {
            String instruction = matcher.group();

            if (instruction.equals("don't()")) {
                enabled = false;
            }
            else if (instruction.equals("do()")) {
                enabled = true;
            }
            else if (enabled) {
                int x = Integer.parseInt(matcher.group(1));
                int y = Integer.parseInt(matcher.group(2));
                sum += x * y;
            }
        }

        return sum;
    }
}
