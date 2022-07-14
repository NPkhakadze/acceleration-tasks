public class Task1 {
    public static void main(String[] args) {
        String text = "abba";
        if(isPalindrome(text)) {
            System.out.println("It is PALINDROME");
        }
        else{
            System.out.println("It is NOT Palindrome");
        }
    }


    public static boolean isPalindrome(String text) {
       for(int i = 0; i < text.length()/2+1; i++) {
           if(text.charAt(i) != text.charAt(text.length()-i-1)) {
               return false;
           }
       }
       return true;
    }

}


