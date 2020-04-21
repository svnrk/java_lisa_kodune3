package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Output.printer;

public class Main {
    static ArrayList<LocationData> locationData;
    static int counter = 0;
    static boolean flag = true;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert file name:");

        String fileName = input.next(); // "temperatures.txt";
        locationData = FileReader.fileReader(fileName);
//        locationData = FileReader.fileReader("temperatures.txt");

        printer(locationData, counter);
//        printerReadable(locationData, counter);
        counter++;

        while (flag) {
            if (counter < locationData.size()) {
                System.out.print("Want to see next? y|n  ");
                String next = input.next();
                if (next.equals("y")) {
                    printer(locationData, counter);
                    counter++;
                } else {
                    flag = false;
                }
            } else {
                flag = false;
                System.out.println("End of file");
            }
        }
    }
}