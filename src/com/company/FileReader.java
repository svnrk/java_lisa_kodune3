package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    static boolean flag = false;

    public static ArrayList<LocationData> fileReader(String fileName) {
        ArrayList<LocationData> locationData = new ArrayList<>();
        try {
            File myObj = new File(fileName);//("filename.txt");
            if (myObj.exists()) {
                flag = true;
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] words = data.split(" ");

                String location = "";
                for (int i = 0; i < (words.length - 5); i++) {
                    location += words[i] + " ";
                }

                int[] temperatures = new int[5];
                for (int j = 0; j < 5; j++) {
                    temperatures[j] = Integer.parseInt(words[words.length - 1 - j]);
                }

                LocationData locTemp = new LocationData(location.substring(0, location.length() - 1), temperatures);
                locationData.add(locTemp);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Use: temperatures.txt");
        }
        return locationData;
    }
}
