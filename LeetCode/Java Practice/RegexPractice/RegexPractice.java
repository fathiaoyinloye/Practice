package RegexPractice;

public class RegexPractice {

    public static boolean isValidPhoneNumber(String phonenumber){
        String pattern = "(070)\\d{8}|(080)\\d{8}|(\\+234)-*[0-9]{10}";
        return phonenumber.matches(pattern);
    }

    public static boolean isValidMail(String email) {
        String pattern = "\\w{3,}(@gmail.com)|\\w.\\w{3,}(@semicolon.africa)";
        return email.matches(pattern);
    }
}
