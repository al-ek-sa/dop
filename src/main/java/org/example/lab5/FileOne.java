package org.example.lab5;

import java.io.*;
import java.util.LinkedList;
/**
 * переполнение файловых дискрипторов
 */
public class FileOne {
    private Integer LIMIT = 1048576;
    private LinkedList<BufferedReader> list = new LinkedList<>();

    public Integer getLIMIT() {
        return LIMIT;
    }

    public void reader() throws IOException {
        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        list.add(bufferedReader);
    }
}
