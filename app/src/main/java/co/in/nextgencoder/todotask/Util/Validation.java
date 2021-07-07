package co.in.nextgencoder.todotask.Util;

public class Validation {
    public String validateUser(String mail, String pass) {
        if( mail == null || mail.isEmpty()) {
            return  "Enter mail to continue";
        }
        if( pass == null || pass.isEmpty()) {
            return  "Enter mail to continue";
        }
        if( pass.length() < 8) {
            return  "Password length should be greater than 8";
        }
        return "Successful";
    }
}
