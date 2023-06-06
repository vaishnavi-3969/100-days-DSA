package Topic.Stack_Reversing_a_word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {
    public static void main() throws IOException {
        String input, output;
        while(true){
            System.out.println("Enter a string: ");
            System.out.flush();
            input = getString();
            if(input.equals("")){
                break;
            }
            Reverser reverser = new Reverser(input);
            output = reverser.doReverse();
            System.out.println("Reversed String: "+output);
        }

    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
