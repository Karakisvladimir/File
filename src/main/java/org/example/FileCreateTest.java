package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreateTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./files/created-from-fos.txt");
        fos.close();
        FileOutputStream yes = new FileOutputStream("./files/Yes.txt");
        System.out.println("yes.getChannel() = " + yes.getChannel());


    }
}
