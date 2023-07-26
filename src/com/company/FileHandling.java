package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        // Code to Create a new File

//        File myFile = new File("Hello.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file");
//            throw new RuntimeException(e);
//        }


        // Code to Write to a File

//        try {
//            FileWriter fileWriter = new FileWriter("Hello.txt");
//            fileWriter.write("First File\nOke Bye");
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // Reading a File

//        File myFile1 = new File("Hello.txt");
//        try {
//            Scanner sc = new Scanner(myFile1);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        // Deleting a File

//        File myFile2 = new File("Hello.txt");
//        if (myFile2.delete()) {
//            System.out.println("I have deleted: "+myFile2.getName());
//        } else {
//            System.out.println("Some problem occurred while deleting");
//        }
    }
}
