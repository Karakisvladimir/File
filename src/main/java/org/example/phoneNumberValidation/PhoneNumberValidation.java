package org.example.phoneNumberValidation;

import java.io.*;

public class PhoneNumberValidation {
    public static void main(String args[]) throws Exception {
        File file = new File("./files/dirb/file.txt");
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.isFile() = " + file.isFile());
        FileInputStream fin = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fin.read(data);
        fin.close();
        String numberTelephone = new String(data);
        String[] tokens = numberTelephone.split("\n");
        for (String token : tokens) {
            if (validatePhoneNumber(token)) {
                System.out.println(token);
            }
        }
    }

    private static boolean validatePhoneNumber(String token) {
        if (token.matches("^\\d{3}-\\d{3}-\\d{4}$"))
            return true;
        else if (token.matches("^\\(\\d{3}\\)\\s\\d{3}-\\d{4}$"))
            return true;
        else
            return false;

    }
}