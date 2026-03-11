package org.example.lab5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class FileTwo {
        private Integer LIMIT = 1048576;

        public Integer getLIMIT() {
            return LIMIT;
        }

        public BufferedReader reader() throws IOException {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            return bufferedReader;
        }
}
