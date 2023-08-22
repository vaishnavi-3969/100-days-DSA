import java.util.Scanner;
//character which occurred max. in the string

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char result = 'a';
        int max=0;
        int[] count = new int[26];

        //traversing through the string and mainta
        for(int i =0 ; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int j =0; j<26; j++){
            if(count[j] > max){
                max = count[j];
                result = (char)('a' + j);
            }
        }
        System.out.println(result);
    }
}