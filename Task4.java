import java.util.Stack;

public class Task4 {
    public static void main(String[] args) {
        String s = "((())))";
        if(isProperly(s)) {
            System.out.println("Properly");
        }
        else{
            System.out.println("NOT Properly");
        }
    }

    public static boolean isProperly(String sequence) {
        if(sequence.charAt(0) == ')') {
            return false;
        }

        Stack myStack = new Stack();
        for(int i = 0; i < sequence.length(); i++) {
            if(sequence.charAt(i) == '(') {
                myStack.push(sequence.charAt(i));
                continue;
            }

            if(myStack.isEmpty()) {
                return false;
            }

            if(sequence.charAt(i) == ')') {
               myStack.pop();
            }
        }
        return myStack.isEmpty();
    }
}
