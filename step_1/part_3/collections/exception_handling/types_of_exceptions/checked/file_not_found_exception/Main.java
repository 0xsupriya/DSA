package step_1.part_3.collections.exception_handling.types_of_exceptions.checked.file_not_found_exception;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("nofile.txt");
            System.out.println(fis);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e);
        }
    }
}
