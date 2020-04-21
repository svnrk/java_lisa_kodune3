package com.company;

import java.util.ArrayList;

public class Output {
    public static void printer(ArrayList<LocationData> locationData, int index) {
        String output = "";
        output += locationData.get(index).getLocation() + " ";
        output += locationData.get(index).getMeanTemp() + " ";
        output += locationData.get(index).getMaxTemp() + " ";
        output += locationData.get(index).getMinTemp() + " ";
        output += locationData.get(index).getTruncatedMeanTemp();

        System.out.println(output);
        System.out.println();
    }

    public static void printerReadable(ArrayList<LocationData> locationData, int index) {
        System.out.println(locationData.get(index).getLocation());
        System.out.println("Average: " + locationData.get(index).getMeanTemp());
        System.out.println("Warmest: " + locationData.get(index).getMaxTemp());
        System.out.println("Coldest: " + locationData.get(index).getMinTemp());
        System.out.println("Truncated average: " + locationData.get(index).getTruncatedMeanTemp());
        System.out.println();
    }
}
