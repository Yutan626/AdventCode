import java.io.*;
import java.util.*;

public class runner {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("input_file.txt"));
        String input = "";

        while (sc.hasNextLine()) {
            input += sc.nextLine();
        }

        int answer = main.solve(input);

        System.out.println("Final sum: " + answer);

        sc.close();
    }
}
