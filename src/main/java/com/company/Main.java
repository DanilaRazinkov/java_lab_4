package com.company;

import com.company.model.Human;
import com.company.reader.ReadCSV;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String csvFilePatch = "/foreign_names.csv";
        char separator = ';';

        ReadCSV read = new ReadCSV();
        List<Human> result= read.readDataFromCsvFile(csvFilePatch, separator);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер строки работника, чтобы получить информацию о нем, или -1, чтобы вывести всех работников. e - выход");
        String mot = in.nextLine();
        while(mot.compareTo("e") != 0) {
            if(mot.compareTo("-1") == 0) {
                for (Human human : result) {
                    System.out.println(human);
                }
            } else {
                try {
                    System.out.println(result.get(Integer.parseInt(mot) - 1));
                } catch (NumberFormatException e) {
                    System.out.println("Неверный индекс");
                }
            }
            System.out.println("Введите следущее значение: ");
            mot = in.nextLine();
        }
    }

}
