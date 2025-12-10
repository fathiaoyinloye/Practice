public class IsPalindrome {
        public boolean isPalindrome(int x) {
            String reverse = "";
            for(int count = 0; count < String.valueOf(x).length(); count++){
                reverse = String.valueOf(x).charAt(count) + reverse;

            }
            System.out.println(reverse);
            return reverse.equals(String.valueOf(x));
        }
    }
