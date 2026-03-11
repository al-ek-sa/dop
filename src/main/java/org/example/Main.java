package org.example;

import org.example.lab5.FileOne;
import org.example.lab5.FileThree;
import org.example.lab5.FileTwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //выбрасывает ошибку OutOfMemoryError, из-за переполнения файлового дискриптора
        /**
        try {
            System.out.println("не закрывайте консоль в течении 5-6 секунд");
            FileOne fileOne = new FileOne();
            for (int i = 1; i <= fileOne.getLIMIT(); i++){
                fileOne.reader();
            }
        } catch (IOException e) {
            System.out.println("ошибка");
        }*/
        //заканчивает работу, но исключение не выбрасывает
        /**try {
            System.out.println("не закрывайте консоль в течении 15 секунд");
            FileTwo fileTwo = new FileTwo();
            for (int i = 1; i <= fileTwo.getLIMIT(); i++){
                fileTwo.reader().close();
            }
        } catch (IOException e) {
            System.out.println("ошибка");
        }*/
        /**try {
            System.out.println("не закрывайте консоль в течении 15 секунд");
            FileThree fileThree = new FileThree();
            for (int i = 1; i <= fileThree.getLIMIT(); i++){
                fileThree.reader();
            }
        } catch (IOException e) {
            System.out.println("ошибка");
        }*/

        //антипаттерн по показу, код завершается но без исключения
        System.out.println("не закрывайте консоль в течении 10 секунд");
        FileThree fileThree = new FileThree();
        for (int i = 1; i <= fileThree.getLIMIT(); i++){
            fileThree.readerOne();
        }
    }
}