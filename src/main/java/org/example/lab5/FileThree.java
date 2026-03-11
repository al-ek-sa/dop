package org.example.lab5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileThree {
    private Integer LIMIT = 1048576;

    public Integer getLIMIT() {
        return LIMIT;
    }
    public void reader() throws IOException {
        Stream<String> readerOne = Files.lines(Paths.get("input.txt"));
        Stream<String> readerTwo = Files.lines(Paths.get("input2.txt"));
        Stream.concat(readerOne, readerTwo).close();
    }

    private void readerTwo() throws IOException {
        Stream<String> readerOne = Files.lines(Paths.get("input1.txt"));
        Stream<String> readerTwo = Files.lines(Paths.get("input2.txt"));
        Stream.concat(readerOne, readerTwo).close();
    }


    public void readerOne() {
        try {
            readerTwo();
        } catch (IOException ignored) {
            //ignored
        }
    }
}
