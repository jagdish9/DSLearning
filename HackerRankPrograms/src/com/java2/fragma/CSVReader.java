package com.java2.fragma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String csvFile = "C:\\Softwares\\Jagdish\\Fragma question 16-Nov-2018\\iplDataSet\\matches.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] matches = line.split(cvsSplitBy);

                System.out.println(matches[0]+"|"+matches[1]+"|"+matches[2]+"|"+matches[3]+"|"+matches[4]+"|"
                		+matches[5]+"|"+matches[6]+"|"+matches[7]+"|"+matches[8]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
