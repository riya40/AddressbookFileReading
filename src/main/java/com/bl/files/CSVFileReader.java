package com.bl.files;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class CSVFileReader {
    public String loaddata() throws Exception{
        //Instantiating the CSVReader class
        CSVReader reader = new CSVReader(new FileReader("E:\\java\\addressbook1.csv"));
        //Reading the contents of the csv file
        StringBuffer buffer = new StringBuffer();
        String line[];
        while ((line = reader.readNext()) != null) {
            for(int i = 0; i<line.length; i++) {
                System.out.print(line[i]+" ");
            }
            System.out.println(" ");
        }
        return "";
    }

    public static void main(String args[]) throws Exception {
        CSVFileReader csvFileReader = new CSVFileReader();
        csvFileReader.loaddata();
    }
}
