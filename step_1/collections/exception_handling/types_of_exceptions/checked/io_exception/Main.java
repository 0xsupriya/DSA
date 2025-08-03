package step_1.collections.exception_handling.types_of_exceptions.checked.io_exception;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(
                    "step_1/collections/exception_handling/types_of_exceptions/checked/io_exception/myfile.txt");
            System.out.println(fr);
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e);
        }

    }

}
