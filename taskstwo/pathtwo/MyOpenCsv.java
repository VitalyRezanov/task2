package com.netcracker.taskstwo.pathtwo;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class MyOpenCsv {
    public static void main(String[] args) throws IOException, CsvValidationException {
        String csv = "data.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));
        String [] record = "4,David,Miller,Australia,30".split(",");
        writer.writeNext(record);
        writer.close();

        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                System.out.println(Arrays.toString(nextLine));
            }
        }
    }
}
