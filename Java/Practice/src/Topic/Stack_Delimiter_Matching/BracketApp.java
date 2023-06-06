package Topic.Stack_Delimiter_Matching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketApp {
    public static void main() throws IOException {
        String input;
        while (true){
            System.out.println("Enter string containing delimiter: ");
            input = getString();
            if(input.equals("")){
                break;
            }
            BracketChecker bc = new BracketChecker(input);
            bc.check();
        }//end while
    } //end main()

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
