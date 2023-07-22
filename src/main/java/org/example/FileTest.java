package org.example;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("./files/aaa.txt");
        File dir = new File("./files");
        File file1 = new File("./files/Yes.txt");
        System.out.println("file1.getAbsolutePath() = " + file1.getAbsolutePath());
//        System.out.println("file.exists() = " + file.exists());
//        System.out.println("file.isFile() = " + file.isFile());
//        System.out.println("dir.isFile() = " + dir.isFile());
//        System.out.println("dir.exists() = " + dir.exists());
//        System.out.println("dir.isDirectory() = " + dir.isDirectory());
//
//        System.out.println("file.getParentFile().isDirectory() = " + file.getParentFile().isDirectory());
//        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
//        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());
//        File[] files = dir.listFiles();
//        for (File f:files) {
//            System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());
//            System.out.println("f.getName() = " + f.getName());
//            System.out.println("f.isDirectory() = " + f.isDirectory());
//            System.out.println("f.isFile() = " + f.isFile());
//
//        }
    }
}
