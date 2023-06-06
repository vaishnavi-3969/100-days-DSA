package Topic.Stack_Reversing_a_word;

public class Reverser {
        String input, output;
        public Reverser(String in){
            input = in;
        }
        public String doReverse(){
            int stackSize = input.length();
            StackX stackX = new StackX(stackSize);

            for(int j = 0; j<stackSize; j++){
                stackX.push(input.charAt(j));
            }
            output = "";
            while(!stackX.isEmpty()){
                output = output + (char)stackX.pop();
            }
            return output;
        }
}
