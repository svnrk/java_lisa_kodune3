package com.company;

public class LocationData {
    private String location;
    private int[] temperature = new int[5];
    private double meanTemp;
    private double truncatedMeanTemp;
    private int maxTemp;
    private int minTemp;

    public LocationData() {
    }

    public LocationData(String location, int[] temperature) {
        this.location = location;
        this.temperature = temperature;
        maxTemp = temperature[0];
        minTemp = temperature[0];
        meanTemp = temperature[0];

        for (int i = 1; i < temperature.length; i++) {
            int temp = temperature[i];
            maxTemp = (temp > maxTemp) ? temp : maxTemp; // Math.max(temperature);
            minTemp = (temp < minTemp) ? temp : minTemp; // Math.min(temperature);
            meanTemp += temp;
        }
        meanTemp /= temperature.length;
        truncatedMeanTemp = (meanTemp * temperature.length - (maxTemp + minTemp)) / (temperature.length - 2);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTemperature() {
        String tempString = "";
        for (int temp : temperature) {
            tempString += temp + " ";
        }
        return tempString;
    }

    public int getTemperature(int index) {
        return temperature[index];
    }

    public void setTemperature(int[] temperature) {
        this.temperature = temperature;
    }

    public void setTemperature(int index, int temperature) {
        this.temperature[index] = temperature;
    }

    public double getMeanTemp() {
        return meanTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public double getTruncatedMeanTemp() {
        return truncatedMeanTemp;
    }
}
