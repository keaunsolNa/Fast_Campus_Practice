package org.example;

public class PasswordValidator {

    public static final String WRONG_PASSWORD_EXCEPTION_MESSAGE = "비밀번호는 최소 8자 이상 12자 이하여야 한다.";

    public static void validator(String password) {

        int length = password.length();

        if(length < 8 || length > 12) {
            throw new IllegalArgumentException(WRONG_PASSWORD_EXCEPTION_MESSAGE);
        }

    }

    public void validate2(PasswordGeneratePolicy passwordGenerator) {
        String password = passwordGenerator.generatePassword();

        int length = password.length();
        if (length < 8 || length > 12) {
            throw new IllegalArgumentException("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
        }
    }
}
