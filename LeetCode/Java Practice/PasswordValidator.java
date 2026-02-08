import Exceptions.BlankException;
import Exceptions.InvalidLengthException;
import Exceptions.NumberException;
import Exceptions.SpecialCharacterException;


public class PasswordValidator{
    public static String checkPasswordValidity(String password){
        validateBlankPassword(password);
        validateLength(password);
        validateSpecialCharacter(password);
        validateNumber(password);

        return "Password Is Valid";
    }

    public static void validateBlankPassword(String password){
        if(password.isEmpty()) throw new BlankException();

    }
    public static void validateNumber(String password){
        boolean isDigit = false;
        for(int count = 0; count < password.length(); count++){
            if(Character.isDigit(password.charAt(count))){
                isDigit = true;
                break;
            }
        }
        if(!isDigit) throw new NumberException();
    }

    public static void validateSpecialCharacter(String password){
        boolean isSpecialCharacter = false;
        for(int count = 0; count < password.length(); count++){
            if(!Character.isLetterOrDigit(password.charAt(count))){
                isSpecialCharacter = true;
                break;
            }
        }
        if(!isSpecialCharacter) throw new SpecialCharacterException();
    }

    public static void validateLength(String password){
       if (password.length() < 8 || password.length() > 20) throw new InvalidLengthException();
    }
    public static void main(String... args) {


        try {
            System.out.println(checkPasswordValidity("df,"));

        } catch (InvalidLengthException | SpecialCharacterException | NumberException | BlankException  e){
            System.out.println(e.getMessage());
        }


    }
}